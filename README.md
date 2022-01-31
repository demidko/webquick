# webQUICK API

Java API для webQUICK терминала. Помогает писать торговых роботов и спускать деньги в трубу.

## Что это и зачем?

У российских брокеров на текущий момент нет полноценных и бесплатных аналогов [Interactive Brokers API](https://www.interactivebrokers.com/en/trading/ib-api.php). Предлагаемые варианты:

1. [Tinkoff API](https://www.tinkoff.ru/invest/open-api/) и ему подобные, которые при близком рассмотрении [оказываются игрушечными](https://habr.com/ru/post/592093/#comment_23810459). 
2. Выделенные FIX шлюзы на бирже, которые стоят от пяти тысяч в месяц. Из преимуществ - высокая скорость, однако далеко не факт что самодельный работ наторгует на эту сумму чтобы выйти в ноль. 
3. Стандартный для России QUICK терминал, который, однако, доступен только для Windows, скрипты можно писать только на Lua. Облачные FIX-коннекторы для QUICK, чтобы работать с другим ЯП или ОС, стоят еще более дорогой подписки.
4. Кроссплатформенный webQUICK терминал [без официального](https://forum.quik.ru/forum16/topic3431/) [API](https://forum.quik.ru/forum8/topic6047/). Бесплатно выдается многими брокерами "из коробки", в том числе БКС, Сбербанк, ВТБ, Финам, и другими.

Поэтому, данный проект протаскивает webQUICK API из браузера в Java. Торговый робот с ним по скорости получится так себе, зато бесплатно, без регистрации и СМС 🙂

## Как установить?

Убедитесь на сайте брокера что у вас есть доступ к webQUICK ([пример для Сбера](https://www.sberbank.ru/ru/person/investments/broker_service/quik)).  
Вам понадобится Gradle, Maven, или другая система сборки.

[![](https://jitpack.io/v/demidko/webquick.svg)](https://jitpack.io/#demidko/webquick)

## Как пользоваться?

```kotlin
Тут будет инструкция немного попозже
```






