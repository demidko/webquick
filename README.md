# webQUICK API

Java API для webQUICK терминала. Помогает писать торговых роботов и спускать деньги в трубу.

## Что это и зачем?

У российских брокеров на текущий момент нет полноценных аналогов [Interactive Brokers API](https://www.interactivebrokers.com/en/trading/ib-api.php). Предлагаемые варианты:

1. [Tinkoff API](https://www.tinkoff.ru/invest/open-api/) и ему подобные, которые при близком рассмотрении [оказываются игрушечными](https://habr.com/ru/post/592093/#comment_23810459). Выделенные шлюзы стоят от пяти тысяч в месяц, и далеко не факт что самодельный работ наторгует на эту сумму чтобы выйти в ноль.
2. Стандартный для России QUICK терминал, который, однако, имеет серьезные минусы:
     * Доступен только для Windows, скрипты можно писать только на Lua. 
     * Облачные FIX-коннекторы для QUICK, чтобы работать с другим ЯП или ОС, стоят еще более дорогой подписки.
3. Кроссплатформенный webQUICK терминал без официального API. Бесплатно выдается многими брокерами "из коробки".

Поэтому, данный проект протаскивает webQUICK API из браузера в Java, бесплатно, без регистрации и СМС 🙂


## Как установить?

Убедитесь на сайте брокера что у вас есть доступ к webQUICK ([пример для Сбера](https://www.sberbank.ru/ru/person/investments/broker_service/quik)).  
Вам понадобится Gradle, Maven, или другая система сборки.

[![](https://jitpack.io/v/demidko/library.svg)](https://jitpack.io/#demidko/library)

## Как пользоваться?

```kotlin
Тут будет инструкция немного попозже
```






