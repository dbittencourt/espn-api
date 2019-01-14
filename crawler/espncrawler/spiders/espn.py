import scrapy
from scrapy.linkextractors import LinkExtractor
from scrapy.spiders import CrawlSpider, Rule


class EspnSpider(CrawlSpider):
    name = 'espn'
    allowed_domains = ['espn.com.au', 'espnfc.com.au']
    start_urls = ['http://www.espn.com.au/football']

    rules = [
        Rule(LinkExtractor(allow=r'/match\?gameId=[0-9]*'), callback='parse_item', follow=True)
    ]

    def parse_item(self, response):
        game = {}
        game['url'] = response.url
        game['id'] = game['url'].split('gameId=')[1]
        game['date'] = response.xpath('//*[@id="gamepackage-game-information"]/article/div/ul[2]/li/div/span/@data-date').extract()[0]
        game['home_name'] = response.xpath('//*[@id="gamepackage-soccer-timeline"]/div/div[1]/a[1]/span[1]/text()').extract()[0]
        game['home_score'] = response.xpath('normalize-space(//*[@id="gamepackage-matchup-wrap--soccer"]/div[2]/div[1]/div/div[3]/span/text()[normalize-space()])').extract()[0]
        game['visitor_name'] = response.xpath('//*[@id="gamepackage-soccer-timeline"]/div/div[1]/a[2]/span[1]/text()').extract()[0]
        game['visitor_score'] = response.xpath('normalize-space(//*[@id="gamepackage-matchup-wrap--soccer"]/div[2]/div[3]/div/div[1]/span/text()[normalize-space()])').extract()[0]

        return game
    