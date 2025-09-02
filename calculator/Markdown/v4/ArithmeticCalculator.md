```java
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculator<T extends Number> {

	private final List<T> resultList = new ArrayList<>();
	private final Class<T> type;

	public ArithmeticCalculator(Class<T> type) {
	    this.type = type;
	}

	public T calculate(T firstNumber, T secondNumber, Operator operator) {
	    T result = operator.apply(firstNumber, secondNumber, type);
	    addResult(result);
	    return result;
	}

	public List<T> getResultsGreaterTahn(T value) {
	    return resultList.stream()
		.filter(r -> converToBigDecimal(r).compareTo(convertToBigDecimal(value)) > 0)
		.collect(Collectors.toList());
	}

	public void addResult(T result) {
	    resultList.add(result);
	}
    }
```
