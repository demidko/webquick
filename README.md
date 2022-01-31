# webQUICK (API)

Java API для торговли на Московской Бирже с брокерского счета СберБанка. Помогает писать роботов и спускать деньги в трубу. Подходит, если вам нравится зеленый цвет и достаточно одной биржи.

## Зачем?

Рано или поздно каждому захочется написать своего торгового робота с учетом фазы луны, гороскопов, погоды, случайных чисел и прочих весьма важных факторов. У российских брокеров для этого недостает полноценных аналогов [Interactive Brokers API](https://www.interactivebrokers.com/en/trading/ib-api.php). Предлагаемые варианты:

1. [Tinkoff API](https://www.tinkoff.ru/invest/open-api) и подобные REST API брокеров, в которых [часть функционала пока недоступна](https://habr.com/ru/post/592093/#comment_23810459).
2. Стандартный в России QUICK терминал, доступен только для Windows, писать можно только на Lua. Однозначно не подходит.
3. [Облачный FIX адаптер](https://arqatech.com/ru/products/quik/modules/integration-solutions/fix-software-interfaces/) для QUICK: так можно воспользоваться готовыми библиотеками для работы с FIX протоколом на любом языке, однако при этом мы получаем сложное проксирование (робот-адаптер-терминал-брокер-биржа), стоит это дороже выделенного шлюза, и на мой взгляд, совершенно нерентабельно.
4. Можно поднять один из open-source FIX коннекторов на своем Windows сервере рядом с QUICK терминалом и обращаться к нему, однако сложность проксирования никуда не девается, а Windows хостинг с интерфейсом все еще дороже размещения обычного Docker контейнера.
5. Выделенные [FIX шлюзы](https://www.moex.com/s442) с прямым доступом к бирже, стоят от пяти тысяч в месяц. Из преимуществ — высокая скорость, однако далеко не факт что самодельный работ наторгует на эту сумму чтобы выйти в ноль. 

Наконец, взглянем на кроссплатформенный webQUICK терминал [без официального](https://forum.quik.ru/forum16/topic3431) [API](https://forum.quik.ru/forum8/topic6047). Такой терминал бесплатно выдается СберБанком для Московской Бирже. Данный проект протаскивает webQUICK API из браузера в Java библиотеку, бесплатно, без регистрации и СМС 🙂 

## Как установить?

1. Получите [доступ к webQUICK](https://www.sberbank.ru/ru/person/investments/broker_service/quik). 
2. Вам понадобится Gradle, Maven, или другая система сборки.
   [![](https://jitpack.io/v/demidko/webquick.svg)](https://jitpack.io/#demidko/webquick)

## Как пользоваться?

```kotlin
Тут будет инструкция немного попозже
```






