import requests
import xml.etree.ElementTree as ET


def scrape_papers(topic, max_results=5):
    base_url = "http://export.arxiv.org/api/query"
    params = {
        'search_query': f'all:{topic}',
        'start': 0,
        'max_results': max_results,
        'sortBy': 'relevance',
        'sortOrder': 'descending'
    }

    response = requests.get(base_url, params=params)
    root = ET.fromstring(response.content)
    ns = {'atom': 'http://www.w3.org/2005/Atom'}

    for entry in root.findall('atom:entry', ns):
        title = entry.find('atom:title', ns).text.strip().replace('\n', ' ')
        authors = [author.find('atom:name', ns).text for author in entry.findall('atom:author', ns)]
        summary = entry.find('atom:summary', ns).text.strip().replace('\n', ' ')

        print(f"Title: {title}")
        print(f"Authors: {', '.join(authors)}")
        print(f"Summary: {summary}")
        print("-" * 80)


topic = "quantum computing"
scrape_papers(topic, 1)