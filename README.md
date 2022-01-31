# webQUICK API

Java API webQUICK терминала Сбербанка. Помогает писать торговых роботов и спускать деньги в трубу. 

## Что это и зачем?

У российских брокеров на текущий момент нет бесплатных аналогов [Interactive Brokers API](https://www.interactivebrokers.com/en/trading/ib-api.php). Предлагаемые варианты:

1. [Tinkoff API](https://www.tinkoff.ru/invest/open-api) и подобные REST API брокеров, в которых [часть функционала недоступна.](https://habr.com/ru/post/592093/#comment_23810459).
2. Стандартный для России QUICK терминал с Lua, можно расширить FIX коннектором чтобы писать на других языках. Однако, это Windows-специфичное решение.
3. Выделенные [FIX шлюзы](https://www.moex.com/s442) с прямым доступом к бирже, стоят от пяти тысяч в месяц. Из преимуществ — высокая скорость, однако далеко не факт что самодельный работ наторгует на эту сумму чтобы выйти в ноль.

Наконец, взглянем на кроссплатформенный webQUICK терминал [без официального](https://forum.quik.ru/forum16/topic3431/) [API](https://forum.quik.ru/forum8/topic6047/). Такой терминал бесплатно выдается Сбербанком для московской биржи. Данный проект протаскивает webQUICK API из браузера в Java. По скорости так себе, зато бесплатно, без регистрации и СМС 🙂

## Как установить?

1. Получите [доступ к webQUICK](https://www.sberbank.ru/ru/person/investments/broker_service/quik). 
2. Вам понадобится Gradle, Maven, или другая система сборки.
   [![](https://jitpack.io/v/demidko/webquick.svg)](https://jitpack.io/#demidko/webquick)

## Как пользоваться?

```kotlin
Тут будет инструкция немного попозже
```






