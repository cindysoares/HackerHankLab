import java.util.function.Predicate;

public class DataTypes {
	
	public static void main(String[] args) {
		String[] input = new String[] {
            "5.35", "a", "false", "100", "I am a code monkey", "true", "17.3", "c", "derp"
        };
		for (String line: input) {
			System.out.println(getDataType(line));
		}
	}
	
	public static String getDataType(String line) {
		Types typeOfTheLine = null;
		for (Types type : Types.values()) {
			if (type.isThisType(line)) {
				typeOfTheLine = type;
				break;
			}
		}
		if(typeOfTheLine == null) return null;
		return typeOfTheLine.toString();
	}
	
	enum ClassifiedType {
		Primitive, Referenced;
	}

	enum Types {
		t_int(ClassifiedType.Primitive, (String value) -> {
			Integer.valueOf(value);
			return true;
		}), 
		t_double(ClassifiedType.Primitive, (String value) -> {
			Double.valueOf(value);
			return true;
		}), 
		t_char(ClassifiedType.Primitive, (String value) -> {
			if (value.toCharArray().length > 1) {
				return false;
			}
			return true;
		}), 
		t_boolean(ClassifiedType.Primitive, (String value) -> {
			if("false".equals(value) || "true".equals(value)) return true;
			return false;
		}), 
		t_String(ClassifiedType.Referenced, (String value) -> {
			return true;
		});
		
		Predicate<String> typeTest;
		ClassifiedType classifiedType;
		
		Types(ClassifiedType classifiedType, Predicate<String> typeTest) {
			this.classifiedType = classifiedType;
			this.typeTest = typeTest;
		}
		
		public String toString() {
			return classifiedType.name() + " : " + name().substring(2);
		}
		
		public boolean isThisType(String value) {
			try {
				return typeTest.test(value);
			} catch(Exception e) {
				return false;
			}
		}
	}
	
}
