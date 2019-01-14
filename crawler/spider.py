from scrapy.crawler import CrawlerProcess
from scrapy.utils.project import get_project_settings

from espncrawler.spiders.espn import EspnSpider


process = CrawlerProcess(get_project_settings())
process.crawl(EspnSpider)
process.start()