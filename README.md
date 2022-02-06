# webQUICK API

Игрушечное Java API для торговли валютой на Московской Бирже с брокерского счета СберБанка. Помогает писать роботов и
спускать деньги в трубу.

## Статус

Не готово к использованию. Автор занялся проектом по выращиванию помидоров в тайге.

## Зачем?

Несомненно, рано или поздно, у каждого человека наступает желание написать своего торгового робота с учетом фазы луны,
погоды, вероятности очередной войны с соседними странами и прочих весьма важных факторов. У российских брокеров для
этого недостает полноценных аналогов [Interactive Brokers API](https://www.interactivebrokers.com/en/trading/ib-api.php)
. Предлагаемые варианты:

1. [Tinkoff API](https://www.tinkoff.ru/invest/open-api) и его аналог Алор, в
   которых [часть функционала пока недоступна](https://habr.com/ru/post/592093/#comment_23810459). Поговаривают что в
   некоторых случаях [Tinkoff API врет](https://habr.com/ru/post/649407/comments/#comment_24035229).
2. Стандартный в России QUICK терминал с собственным проприетарным протоколом, выдается всеми брокерами, доступен только
   для Windows, писать можно только на Lua. Не подходит для кроссплатформенной разработки.
3. [Облачный FIX адаптер](https://arqatech.com/ru/products/quik/modules/integration-solutions/fix-software-interfaces/)
   для QUICK: так можно воспользоваться готовыми библиотеками для работы с FIX протоколом на любом языке, однако при
   этом мы получаем сложное проксирование (робот-адаптер-терминал-брокер-биржа), стоит это дороже выделенного шлюза, и
   выглядит совершенно нерентабельно.
4. Можно бесплатно поднять один из open-source FIX коннекторов на своем Windows сервере рядом с QUICK терминалом и
   обращаться к нему, однако сложность проксирования никуда не девается, и хостинг с интерфейсом все еще стоит денег.
5. Выделенные [FIX шлюзы](https://www.moex.com/s442) с прямым доступом к бирже, на начало 2022ого года стоят от четырех
   тысяч в месяц. Из преимуществ — высокая скорость, однако вряд-ли самодельный работ наторгует на эту сумму чтобы выйти
   в ноль.

Наконец, взглянем на кроссплатформенный webQUICK
терминал [без официального](https://forum.quik.ru/forum16/topic3431) [API](https://forum.quik.ru/forum8/topic6047).
Такой терминал бесплатно выдается СберБанком для Московской Биржи. Каждую операцию нужно подтверждать по СМС.

Данный проект протаскивает webQUICK из браузера в Java библиотеку.

## Как подключить?

У вас должен быть открыт брокерский счет в СберБанке. Это можно сделать парой кликов в приложении, обслуживание всегда
бесплатное.

1. Убедитесь что у вас
   есть [доступ к webQUICK](https://www.sberbank.ru/ru/person/investments/broker_service/quik?tab=install).
2. Вам понадобится Gradle, Maven, или другая система сборки. Подключите библиотеку из репозитория:

   [![](https://jitpack.io/v/demidko/webquick.svg)](https://jitpack.io/#demidko/webquick)

   Поддерживается JDK11 и выше.

## Как пользоваться?

```kotlin
Тут будет инструкция немного попозже
```






