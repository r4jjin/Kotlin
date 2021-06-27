package attempt_rough/*
* in explicit type casting we use 'as' operator.

Explicit type casting can be done using :
1. Unsafe cast operator: as
2. Safe cast operator: as?

* Unsafe cast operator : as
* There might be possibility that we can not cast variable to target type
* and it throws an exception at runtime, thats why it is called as unsafe casting.eg..
* fun attempt_rough.main(args: Array<String>){
	val str1: Any = 11
	val str2: String = str1 as String	 // throw exception
	println(str1)
}
* fun attempt_rough.main(args: Array<String>){
	val str1: String? = null
	val str2: String = str1 as String	 // throw exception
	println(str1)
}


* Working example
fun attempt_rough.main(args: Array<String>){
	val str1: String = "It works fine"
	val str2: String = str1 as String	 // Works
	println(str1)
}

* Safe cast operator: as?
* fun attempt_rough.main(args: Array<String>){

	var str1: Any = "Safe casting"
	val str2: String? = str1 as? String	 // it works
	str1 = 11
	// type casting not possible so returns null to str3
	val str3: String? = str1 as? String
	val str4: Int? = str1 as? Int		 // it works
	println(str2)
	println(str3)
	println(str4)
}

*
* */