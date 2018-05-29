стр.195 7.4.Обработка исключений 

Вопросы
- что такое ассоциативное отображение ?
- scala трейты (подобны интерфейсам Java) ?
- алмазное наследование (побочный эффект множественного наследования)?
- Все операции в scala являются вызовами методов
- метод apply и круглые скобки
- оператор cons - ::
- Nil , что это ?
- объект контейнер (картеж) ?
- object VS Class
- метод -> возвращает картеж (ключб значение)
- что такое сценарий ?
- в отсутствии явного слова return метод в scala возвращает последнее вычисляемое им значение
- метод который выполняется только для получения побочного
  эффекта называется процедурой
- класс и объект спутники могут обращаться к закрытым элементам друг друга
- синглтон объект вызывается так: имя синглтон-объекта точка имя метода (как статический класс в Java)
- чем различаются синглтон-объект в scala и статический класс java ?
- объект первого класса ?
- автономный объект - синглтон объект без спутника
- по умолчанию импортируется синглтон-объект Predef
- сценарий scala и запуск сценария
- непонятно как трейт App запустил код на выполнение
- подразумеваемые преобразования
- импорт в скобках import org.apache.http.{HttpEntity, HttpResponse}
- если я объявил поля в конструкторе, как к ним обратиться ?
- case классы
- case e: Exception => 0
- символ _ (подчеркивания)
- литералы обозначений 'symbol
- строковая интеполяция - s"Hello $name!", если переменная name = "Denis", то получится строка "Hello Denis". Интерполятор s подставляет метод name.toString.
- можно сделать такую интерполяцию - s"Ответ равен ${6 * 7}"  и получится строка "Ответ равен 42"
- строковый интерполятор raw ведет себя практически также как и s, только не распознает управляющие последоватьности символьных литератлов
    например raw"No\\\\escate" выведет "No\\\\escate" а не "No\\escate"  
- строковый интерполятор f позволяет прикреплять к встроенным выражениям инструкции форматирования в стиле функции printf (синтаксис java.util.Formatter)
  например f"${Math.PI}%.5f" выведет "3.14159" (5 знаков после запятой)
- "+" - инфиксный оператор (получает два операнда, в нотации операторов можно воспользоваться любым методом т.е метод можно использовать как оператор)
- префиксная (один операнд) Оператор размещается справа от операнда. В методах ставится приставка unary_ (unary_-)
- только 4 идентификатора можно задействовать в префиксном операторе (+, -, !, ~)
- если метод имеет побочные эфекты, то после него нужно ставить круглые скобки 
- постфиксная (м.б. один операнд)
- через == можно сравнивать содержимое объектов, даже имеющие разные типы (сначала проверяется на null, потом вызывается метод equals())
- функции – это конструкции первого класса(что такое конструкции первого класса ?)
- ключевое слово lazy ?
- null - это тоже тип ? (потому что <code>def max2(x: Int, y: Int) = null</code> выведет <code>max2: (x: Int, y: Int)Null</code>)
- Имя, список параметров и возвращаемый тип, если он указан, образуют сигнатуру метода.
- в Scala вы можете смешивать trait-ы во время создания экземпляра ?
- Хаскель- это функциональный яп, который не допускает side эффектов внутри вычислений. А как тогда писать лог или БД
