package by.bsu.memento;

import java.util.HashMap;
import java.util.Map;

public class RequestParameter {
	private Map<String, String> param;

	public RequestParameter(Map<String, String> param) {
		this.param = param;
	}

	public Memento getMemento() {
		//param.entrySet().stream().flatMap()
		Map<String, String> state = (Map<String, String>) ((HashMap<String, String>) param).clone();
		return new RequestParameterMemento(state);
	}

	public void setMemento(Memento obj) {
		if (obj instanceof RequestParameterMemento) {
			RequestParameterMemento memento = (RequestParameterMemento) obj;
			param = memento.state;
		}
	}

	private class RequestParameterMemento implements Memento {
		private Map<String, String> state;

		RequestParameterMemento(Map<String, String> state) {
			this.state = state;
		}
	}

	public void addParam(String key, String value) {
		param.put(key, value);
	}

	public Map<String, String> getParams() {
		return param;
	}

	public void removeParam(String key) {
		param.remove(key);
	}

	public void clearParams() {
		param.clear();
	}
}
