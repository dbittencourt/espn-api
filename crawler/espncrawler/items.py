import scrapy


class GameItem(scrapy.Item):
	url = scrapy.Field()
	id = scrapy.Field()
	date = scrapy.Field()
	home_name = scrapy.Field()
	home_score = scrapy.Field()
	visitor_name = scrapy.Field()
	visitor_score = scrapy.Field()
    pass
