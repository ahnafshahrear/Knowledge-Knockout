public class CppQuestions implements Questions {
    private String[][] questions;
    private String[][] answers;

    public CppQuestions() {
        questions = new String[100][5];
        answers = new String[100][1];

        questions[0][0] = "Which of the following is used to define a preprocessor directive in C++?";
        questions[0][1] = "#define";
        questions[0][2] = "#include";
        questions[0][3] = "#if";
        questions[0][4] = "#endif";
        answers[0][0] = "#define";

        questions[1][0] = "Which operator is used to allocate memory for an array in C++?";
        questions[1][1] = "malloc";
        questions[1][2] = "calloc";
        questions[1][3] = "new";
        questions[1][4] = "alloc";
        answers[1][0] = "new";

        questions[2][0] = "Which of the following is the correct syntax to create a reference variable in C++?";
        questions[2][1] = "int &var";
        questions[2][2] = "int var&";
        questions[2][3] = "int var&=";
        questions[2][4] = "int &=var";
        answers[2][0] = "int &var";

        questions[3][0] = "Which of the following is used to handle exceptions in C++?";
        questions[3][1] = "try and catch";
        questions[3][2] = "throw";
        questions[3][3] = "catch";
        questions[3][4] = "All of the above";
        answers[3][0] = "All of the above";

        questions[4][0] = "Which keyword is used to prevent a class from being inherited in C++?";
        questions[4][1] = "sealed";
        questions[4][2] = "final";
        questions[4][3] = "noninherit";
        questions[4][4] = "None of the above";
        answers[4][0] = "final";

        questions[5][0] = "Which of the following is used to terminate a loop in C++?";
        questions[5][1] = "break";
        questions[5][2] = "continue";
        questions[5][3] = "return";
        questions[5][4] = "exit";
        answers[5][0] = "break";

        questions[6][0] = "Which of the following is used to inherit from a class in C++?";
        questions[6][1] = ":";
        questions[6][2] = "::";
        questions[6][3] = "->";
        questions[6][4] = ".";
        answers[6][0] = ":";

        questions[7][0] = "Which of the following is the correct way to declare a pointer in C++?";
        questions[7][1] = "int* ptr;";
        questions[7][2] = "int ptr*;";
        questions[7][3] = "int &ptr;";
        questions[7][4] = "int* ptr&;";
        answers[7][0] = "int* ptr;";

        questions[8][0] = "Which of the following is not a valid access specifier in C++?";
        questions[8][1] = "private";
        questions[8][2] = "protected";
        questions[8][3] = "public";
        questions[8][4] = "internal";
        answers[8][0] = "internal";

        questions[9][0] = "Which of the following is used to create an object in C++?";
        questions[9][1] = "new";
        questions[9][2] = "create";
        questions[9][3] = "allocate";
        questions[9][4] = "construct";
        answers[9][0] = "new";

        questions[10][0] = "Which of the following is the correct syntax for a C++ comment?";
        questions[10][1] = "// comment";
        questions[10][2] = "/* comment";
        questions[10][3] = "# comment";
        questions[10][4] = "% comment";
        answers[10][0] = "// comment";

        questions[11][0] = "Which of the following is the correct way to declare a constant in C++?";
        questions[11][1] = "const int x = 10;";
        questions[11][2] = "int const x = 10;";
        questions[11][3] = "#define x 10";
        questions[11][4] = "All of the above";
        answers[11][0] = "All of the above";

        questions[12][0] = "Which of the following is the correct way to overload an operator in C++?";
        questions[12][1] = "operator+";
        questions[12][2] = "overload+";
        questions[12][3] = "op+";
        questions[12][4] = "operator()";
        answers[12][0] = "operator+";

        questions[13][0] = "Which of the following is the correct way to define a function in C++?";
        questions[13][1] = "void function() {}";
        questions[13][2] = "function void() {}";
        questions[13][3] = "void function[] {}";
        questions[13][4] = "void function() [] {}";
        answers[13][0] = "void function() {}";

        questions[14][0] = "Which of the following is used to create a namespace in C++?";
        questions[14][1] = "namespace";
        questions[14][2] = "package";
        questions[14][3] = "module";
        questions[14][4] = "space";
        answers[14][0] = "namespace";

        questions[15][0] = "Which of the following is the correct way to declare a template in C++?";
        questions[15][1] = "template <typename T>";
        questions[15][2] = "template <class T>";
        questions[15][3] = "template <T>";
        questions[15][4] = "Both a and b";
        answers[15][0] = "Both a and b";

        questions[16][0] = "Which of the following is the correct way to handle multiple exceptions in C++?";
        questions[16][1] = "Multiple catch blocks";
        questions[16][2] = "Single catch block with multiple exception types";
        questions[16][3] = "Nested try-catch blocks";
        questions[16][4] = "All of the above";
        answers[16][0] = "All of the above";

        questions[17][0] = "Which of the following is the correct way to create an inline function in C++?";
        questions[17][1] = "inline void function() {}";
        questions[17][2] = "void inline function() {}";
        questions[17][3] = "void function() inline {}";
        questions[17][4] = "inline function void() {}";
        answers[17][0] = "inline void function() {}";

        questions[18][0] = "Which of the following is the correct way to declare a destructor in C++?";
        questions[18][1] = "~ClassName() {}";
        questions[18][2] = "destructor ClassName() {}";
        questions[18][3] = "void ~ClassName() {}";
        questions[18][4] = "void ClassName() {}";
        answers[18][0] = "~ClassName() {}";

        questions[19][0] = "Which of the following is the correct way to declare a friend function in C++?";
        questions[19][1] = "friend void function();";
        questions[19][2] = "void friend function();";
        questions[19][3] = "friend function void();";
        questions[19][4] = "void function() friend;";
        answers[19][0] = "friend void function();";

        questions[20][0] = "Which of the following is used to define a macro in C++?";
        questions[20][1] = "#define";
        questions[20][2] = "#include";
        questions[20][3] = "#if";
        questions[20][4] = "#endif";
        answers[20][0] = "#define";

        questions[21][0] = "Which of the following is the correct way to cast an integer to a float in C++?";
        questions[21][1] = "static_cast<float>(x)";
        questions[21][2] = "dynamic_cast<float>(x)";
        questions[21][3] = "reinterpret_cast<float>(x)";
        questions[21][4] = "const_cast<float>(x)";
        answers[21][0] = "static_cast<float>(x)";

        questions[22][0] = "Which of the following is the correct syntax for a single line comment in C++?";
        questions[22][1] = "// comment";
        questions[22][2] = "/* comment";
        questions[22][3] = "# comment";
        questions[22][4] = "-- comment";
        answers[22][0] = "// comment";

        questions[23][0] = "Which of the following is the correct syntax for a multi-line comment in C++?";
        questions[23][1] = "/* comment */";
        questions[23][2] = "// comment";
        questions[23][3] = "# comment";
        questions[23][4] = "-- comment";
        answers[23][0] = "/* comment */";

        questions[24][0] = "Which of the following is used to access members of a class in C++?";
        questions[24][1] = ".";
        questions[24][2] = "->";
        questions[24][3] = "::";
        questions[24][4] = "#";
        answers[24][0] = ".";

        questions[25][0] = "Which of the following is used to check if a number is NaN (not a number) in C++?";
        questions[25][1] = "std::isnan()";
        questions[25][2] = "std::isinf()";
        questions[25][3] = "std::isfinite()";
        questions[25][4] = "std::isnormal()";
        answers[25][0] = "std::isnan()";

        questions[26][0] = "Which of the following is the correct way to declare an array in C++?";
        questions[26][1] = "int arr[10];";
        questions[26][2] = "int arr{10};";
        questions[26][3] = "int arr(10);";
        questions[26][4] = "int arr<10>;";
        answers[26][0] = "int arr[10];";

        questions[27][0] = "Which of the following is the correct way to declare a structure in C++?";
        questions[27][1] = "struct MyStruct { int a; };";
        questions[27][2] = "struct MyStruct { int a: };";
        questions[27][3] = "struct MyStruct { int a; }";
        questions[27][4] = "struct MyStruct: { int a; };";
        answers[27][0] = "struct MyStruct { int a; };";

        questions[28][0] = "Which of the following is the correct way to declare a function pointer in C++?";
        questions[28][1] = "int (*funcPtr)(int, int);";
        questions[28][2] = "int *funcPtr(int, int);";
        questions[28][3] = "int funcPtr*(int, int);";
        questions[28][4] = "int funcPtr(int, int);";
        answers[28][0] = "int (*funcPtr)(int, int);";

        questions[29][0] = "Which of the following is the correct way to declare a class in C++?";
        questions[29][1] = "class MyClass { public: int a; };";
        questions[29][2] = "class MyClass { public: int a: };";
        questions[29][3] = "class MyClass { public: int a; }";
        questions[29][4] = "class MyClass: { public: int a; };";
        answers[29][0] = "class MyClass { public: int a; };";

        questions[30][0] = "Which of the following is the correct way to declare a pure virtual function in C++?";
        questions[30][1] = "virtual void myFunction() = 0;";
        questions[30][2] = "void virtual myFunction() = 0;";
        questions[30][3] = "virtual void myFunction() == 0;";
        questions[30][4] = "void myFunction() = virtual 0;";
        answers[30][0] = "virtual void myFunction() = 0;";

        questions[31][0] = "Which of the following is used to terminate a program in C++?";
        questions[31][1] = "exit()";
        questions[31][2] = "break";
        questions[31][3] = "continue";
        questions[31][4] = "return";
        answers[31][0] = "exit()";

        questions[32][0] = "Which of the following is the correct way to define a macro with parameters in C++?";
        questions[32][1] = "#define SQUARE(x) ((x) * (x))";
        questions[32][2] = "#define SQUARE x ((x) * (x))";
        questions[32][3] = "#define SQUARE(x) ((x) * x)";
        questions[32][4] = "#define SQUARE x ((x) * x)";
        answers[32][0] = "#define SQUARE(x) ((x) * (x))";

        questions[33][0] = "Which of the following is used to check the size of a data type in C++?";
        questions[33][1] = "sizeof";
        questions[33][2] = "size";
        questions[33][3] = "length";
        questions[33][4] = "type_size";
        answers[33][0] = "sizeof";

        questions[34][0] = "Which of the following is the correct way to declare an enum in C++?";
        questions[34][1] = "enum MyEnum { VALUE1, VALUE2 };";
        questions[34][2] = "enum MyEnum { VALUE1: VALUE2 };";
        questions[34][3] = "enum MyEnum ( VALUE1, VALUE2 );";
        questions[34][4] = "enum MyEnum: VALUE1, VALUE2;";
        answers[34][0] = "enum MyEnum { VALUE1, VALUE2 };";

        questions[35][0] = "Which of the following is used to dynamically allocate memory in C++?";
        questions[35][1] = "new";
        questions[35][2] = "malloc";
        questions[35][3] = "calloc";
        questions[35][4] = "alloc";
        answers[35][0] = "new";

        questions[36][0] = "Which of the following is the correct way to release dynamically allocated memory in C++?";
        questions[36][1] = "delete";
        questions[36][2] = "free";
        questions[36][3] = "release";
        questions[36][4] = "dealloc";
        answers[36][0] = "delete";

        questions[37][0] = "Which of the following is the correct way to create a constant pointer in C++?";
        questions[37][1] = "int* const ptr = &value;";
        questions[37][2] = "const int* ptr = &value;";
        questions[37][3] = "int const* ptr = &value;";
        questions[37][4] = "const int* const ptr = &value;";
        answers[37][0] = "int* const ptr = &value;";

        questions[38][0] = "Which of the following is the correct way to use the 'this' pointer in C++?";
        questions[38][1] = "this->member";
        questions[38][2] = "this.member";
        questions[38][3] = "*this.member";
        questions[38][4] = "this->*member";
        answers[38][0] = "this->member";

        questions[39][0] = "Which of the following is the correct way to declare a static member function in C++?";
        questions[39][1] = "static void myFunction();";
        questions[39][2] = "void static myFunction();";
        questions[39][3] = "void myFunction() static;";
        questions[39][4] = "static myFunction() void;";
        answers[39][0] = "static void myFunction();";

        questions[40][0] = "Which of the following is the correct way to declare a mutable data member in C++?";
        questions[40][1] = "mutable int myVar;";
        questions[40][2] = "int mutable myVar;";
        questions[40][3] = "mutable myVar int;";
        questions[40][4] = "int myVar mutable;";
        answers[40][0] = "mutable int myVar;";

        questions[41][0] = "Which of the following is used to get the type of a variable at runtime in C++?";
        questions[41][1] = "typeid";
        questions[41][2] = "typeof";
        questions[41][3] = "typename";
        questions[41][4] = "typetype";
        answers[41][0] = "typeid";

        questions[42][0] = "Which of the following is the correct way to use the 'new' operator to create an array in C++?";
        questions[42][1] = "int* arr = new int[10];";
        questions[42][2] = "int* arr = new int(10);";
        questions[42][3] = "int* arr = new int<10>;";
        questions[42][4] = "int* arr = new int{10};";
        answers[42][0] = "int* arr = new int[10];";

        questions[43][0] = "Which of the following is the correct way to declare a private member function in C++?";
        questions[43][1] = "private: void myFunction();";
        questions[43][2] = "void private myFunction();";
        questions[43][3] = "void myFunction() private;";
        questions[43][4] = "private void myFunction();";
        answers[43][0] = "private: void myFunction();";

        questions[44][0] = "Which of the following is the correct way to declare a friend class in C++?";
        questions[44][1] = "friend class MyClass;";
        questions[44][2] = "class friend MyClass;";
        questions[44][3] = "friend MyClass class;";
        questions[44][4] = "MyClass friend class;";
        answers[44][0] = "friend class MyClass;";

        questions[45][0] = "Which of the following is used to get the length of an array in C++?";
        questions[45][1] = "sizeof(arr) / sizeof(arr[0])";
        questions[45][2] = "sizeof(arr) / sizeof(*arr)";
        questions[45][3] = "length(arr)";
        questions[45][4] = "size(arr)";
        answers[45][0] = "sizeof(arr) / sizeof(arr[0])";

        questions[46][0] = "Which of the following is used to refer to the current instance of a class in C++?";
        questions[46][1] = "this";
        questions[46][2] = "self";
        questions[46][3] = "current";
        questions[46][4] = "instance";
        answers[46][0] = "this";

        questions[47][0] = "Which of the following is the correct way to declare a constructor in C++?";
        questions[47][1] = "MyClass() {}";
        questions[47][2] = "void MyClass() {}";
        questions[47][3] = "constructor MyClass() {}";
        questions[47][4] = "MyClass.constructor() {}";
        answers[47][0] = "MyClass() {}";

        questions[48][0] = "Which of the following is the correct way to declare a copy constructor in C++?";
        questions[48][1] = "MyClass(const MyClass& other) {}";
        questions[48][2] = "MyClass(MyClass other) {}";
        questions[48][3] = "MyClass(const MyClass other) {}";
        questions[48][4] = "MyClass(MyClass& other) {}";
        answers[48][0] = "MyClass(const MyClass& other) {}";

        questions[49][0] = "Which of the following is the correct way to declare a virtual destructor in C++?";
        questions[49][1] = "virtual ~MyClass() {}";
        questions[49][2] = "virtual void ~MyClass() {}";
        questions[49][3] = "~MyClass() virtual {}";
        questions[49][4] = "void virtual ~MyClass() {}";
        answers[49][0] = "virtual ~MyClass() {}";

        questions[50][0] = "Which of the following is the correct way to implement a single inheritance in C++?";
        questions[50][1] = "class Derived : public Base {};";
        questions[50][2] = "class Derived extends Base {};";
        questions[50][3] = "class Derived inherits Base {};";
        questions[50][4] = "class Derived : Base {};";
        answers[50][0] = "class Derived : public Base {};";

        questions[51][0] = "Which of the following is the correct way to overload the '+' operator in C++?";
        questions[51][1] = "MyClass operator+(const MyClass& other);";
        questions[51][2] = "MyClass overload+(const MyClass& other);";
        questions[51][3] = "MyClass operator_overload+(const MyClass& other);";
        questions[51][4] = "MyClass op+(const MyClass& other);";
        answers[51][0] = "MyClass operator+(const MyClass& other);";

        questions[52][0] = "Which of the following is the correct way to declare a lambda function in C++?";
        questions[52][1] = "auto func = []() {};";
        questions[52][2] = "lambda func = []() {};";
        questions[52][3] = "[] auto func = {};";
        questions[52][4] = "func = [] auto {};";
        answers[52][0] = "auto func = []() {};";

        questions[53][0] = "Which of the following is the correct way to use the 'auto' keyword in C++?";
        questions[53][1] = "auto var = 10;";
        questions[53][2] = "int auto var = 10;";
        questions[53][3] = "auto int var = 10;";
        questions[53][4] = "var auto = 10;";
        answers[53][0] = "auto var = 10;";

        questions[54][0] = "Which of the following is the correct way to use the 'nullptr' keyword in C++?";
        questions[54][1] = "int* ptr = nullptr;";
        questions[54][2] = "int* ptr = NULL;";
        questions[54][3] = "int* ptr = 0;";
        questions[54][4] = "int* ptr = nil;";
        answers[54][0] = "int* ptr = nullptr;";

        questions[55][0] = "Which of the following is the correct way to declare a unique pointer in C++?";
        questions[55][1] = "std::unique_ptr<int> ptr = std::make_unique<int>(10);";
        questions[55][2] = "std::unique_ptr<int> ptr = std::make_unique<int>(10);";
        questions[55][3] = "std::unique<int> ptr = make_unique<int>(10);";
        questions[55][4] = "unique_ptr<int> ptr = make_unique<int>(10);";
        answers[55][0] = "std::unique_ptr<int> ptr = std::make_unique<int>(10);";

        questions[56][0] = "Which of the following is the correct way to declare a shared pointer in C++?";
        questions[56][1] = "std::shared_ptr<int> ptr = std::make_shared<int>(10);";
        questions[56][2] = "std::shared<int> ptr = make_shared<int>(10);";
        questions[56][3] = "shared_ptr<int> ptr = make_shared<int>(10);";
        questions[56][4] = "std::shared_ptr<int> ptr = make_shared<int>(10);";
        answers[56][0] = "std::shared_ptr<int> ptr = std::make_shared<int>(10);";

        questions[57][0] = "Which of the following is the correct way to declare a weak pointer in C++?";
        questions[57][1] = "std::weak_ptr<int> ptr = std::shared_ptr<int>(new int(10));";
        questions[57][2] = "std::weak<int> ptr = weak_ptr<int>(new int(10));";
        questions[57][3] = "weak_ptr<int> ptr = shared_ptr<int>(new int(10));";
        questions[57][4] = "std::weak_ptr<int> ptr = std::make_shared<int>(10);";
        answers[57][0] = "std::weak_ptr<int> ptr = std::shared_ptr<int>(new int(10));";

        questions[58][0] = "Which of the following is the correct way to use the 'std::move' function in C++?";
        questions[58][1] = "std::string str = std::move(otherStr);";
        questions[58][2] = "std::string str = move(otherStr);";
        questions[58][3] = "std::string str = std::move(otherStr);";
        questions[58][4] = "std::string str = std::move<int>(otherStr);";
        answers[58][0] = "std::string str = std::move(otherStr);";

        questions[59][0] = "Which of the following is the correct way to declare a noexcept function in C++?";
        questions[59][1] = "void myFunction() noexcept;";
        questions[59][2] = "noexcept void myFunction();";
        questions[59][3] = "void noexcept myFunction();";
        questions[59][4] = "void myFunction() noexcept() {}";
        answers[59][0] = "void myFunction() noexcept;";

        questions[60][0] = "Which of the following is the correct way to use the 'decltype' keyword in C++?";
        questions[60][1] = "decltype(var) newVar;";
        questions[60][2] = "decltype(var) newVar = var;";
        questions[60][3] = "decltype(var) var newVar;";
        questions[60][4] = "decltype(var) = newVar;";
        answers[60][0] = "decltype(var) newVar;";

        questions[61][0] = "Which of the following is the correct way to use the 'static_assert' keyword in C++?";
        questions[61][1] = "static_assert(condition, \"error message\");";
        questions[61][2] = "static_assert \"error message\";";
        questions[61][3] = "assert_static(condition, \"error message\");";
        questions[61][4] = "static_assert(condition);";
        answers[61][0] = "static_assert(condition, \"error message\");";

        questions[62][0] = "Which of the following is the correct way to use the 'constexpr' keyword in C++?";
        questions[62][1] = "constexpr int myConst = 10;";
        questions[62][2] = "const int myConst = 10;";
        questions[62][3] = "constexpr int myConst;";
        questions[62][4] = "int constexpr myConst = 10;";
        answers[62][0] = "constexpr int myConst = 10;";

        questions[63][0] = "Which of the following is the correct way to use the 'std::array' container in C++?";
        questions[63][1] = "std::array<int, 10> arr;";
        questions[63][2] = "std::array<int> arr;";
        questions[63][3] = "std::array arr(10);";
        questions[63][4] = "std::array<int, 10> arr[10];";
        answers[63][0] = "std::array<int, 10> arr;";

        questions[64][0] = "Which of the following is the correct way to declare a multithreaded program in C++?";
        questions[64][1] = "#include <thread>";
        questions[64][2] = "#include <threads>";
        questions[64][3] = "#include <pthread>";
        questions[64][4] = "#include <multi_thread>";
        answers[64][0] = "#include <thread>";

        questions[65][0] = "Which of the following is the correct way to declare a mutex in C++?";
        questions[65][1] = "std::mutex mtx;";
        questions[65][2] = "std::mutex mtx();";
        questions[65][3] = "mutex mtx;";
        questions[65][4] = "mutex mtx();";
        answers[65][0] = "std::mutex mtx;";

        questions[66][0] = "Which of the following is the correct way to lock a mutex in C++?";
        questions[66][1] = "mtx.lock();";
        questions[66][2] = "lock(mtx);";
        questions[66][3] = "mtx.lock;";
        questions[66][4] = "lock(mtx);";
        answers[66][0] = "mtx.lock();";

        questions[67][0] = "Which of the following is the correct way to declare a condition variable in C++?";
        questions[67][1] = "std::condition_variable cv;";
        questions[67][2] = "condition_variable cv;";
        questions[67][3] = "std::condition cv;";
        questions[67][4] = "condition cv;";
        answers[67][0] = "std::condition_variable cv;";

        questions[68][0] = "Which of the following is the correct way to wait for a condition variable in C++?";
        questions[68][1] = "cv.wait(lock);";
        questions[68][2] = "wait(cv);";
        questions[68][3] = "cv.wait();";
        questions[68][4] = "wait(cv, lock);";
        answers[68][0] = "cv.wait(lock);";

        questions[69][0] = "Which of the following is the correct way to notify one thread waiting on a condition variable in C++?";
        questions[69][1] = "cv.notify_one();";
        questions[69][2] = "notify_one(cv);";
        questions[69][3] = "cv.notify();";
        questions[69][4] = "notify(cv);";
        answers[69][0] = "cv.notify_one();";

        questions[70][0] = "Which of the following is used to define a pure virtual function in C++?";
        questions[70][1] = "virtual void func() = 0;";
        questions[70][2] = "void virtual func() = 0;";
        questions[70][3] = "virtual void func() {};";
        questions[70][4] = "pure virtual void func();";
        answers[70][0] = "virtual void func() = 0;";

        questions[71][0] = "Which of the following is the correct way to declare a lambda function in C++?";
        questions[71][1] = "auto func = [](int x) { return x * 2; };";
        questions[71][2] = "lambda func = [](int x) { return x * 2; };";
        questions[71][3] = "lambda void func(int x) { return x * 2; };";
        questions[71][4] = "auto void func = [](int x) { return x * 2; };";
        answers[71][0] = "auto func = [](int x) { return x * 2; };";

        questions[72][0] = "Which of the following is used to perform dynamic memory allocation in C++?";
        questions[72][1] = "new";
        questions[72][2] = "malloc";
        questions[72][3] = "allocate";
        questions[72][4] = "create";
        answers[72][0] = "new";

        questions[73][0] = "Which keyword is used to declare a class in C++?";
        questions[73][1] = "class";
        questions[73][2] = "struct";
        questions[73][3] = "type";
        questions[73][4] = "new";
        answers[73][0] = "class";

        questions[74][0] = "Which of the following is the correct syntax to inherit a class publicly in C++?";
        questions[74][1] = "class Derived : public Base {};";
        questions[74][2] = "class Derived extends Base {};";
        questions[74][3] = "class Derived inherits Base {};";
        questions[74][4] = "class Derived : Base {};";
        answers[74][0] = "class Derived : public Base {};";

        questions[75][0] = "Which operator is used to access members of a class in C++?";
        questions[75][1] = ".";
        questions[75][2] = "->";
        questions[75][3] = "::";
        questions[75][4] = ":";
        answers[75][0] = ".";

        questions[76][0] = "Which of the following is the correct syntax to declare a constructor in C++?";
        questions[76][1] = "ClassName() {}";
        questions[76][2] = "void ClassName() {}";
        questions[76][3] = "constructor ClassName() {}";
        questions[76][4] = "ClassName {}";
        answers[76][0] = "ClassName() {}";

        questions[77][0] = "Which keyword is used to refer to the current instance of a class in C++?";
        questions[77][1] = "this";
        questions[77][2] = "self";
        questions[77][3] = "Me";
        questions[77][4] = "current";
        answers[77][0] = "this";

        questions[78][0] = "Which of the following is the correct way to declare a destructor in C++?";
        questions[78][1] = "~ClassName() {}";
        questions[78][2] = "destructor ClassName() {}";
        questions[78][3] = "void ~ClassName() {}";
        questions[78][4] = "void ClassName() {}";
        answers[78][0] = "~ClassName() {}";

        questions[79][0] = "Which of the following is used to perform explicit type conversion in C++?";
        questions[79][1] = "static_cast";
        questions[79][2] = "type_cast";
        questions[79][3] = "explicit_cast";
        questions[79][4] = "cast";
        answers[79][0] = "static_cast";

        questions[80][0] = "Which of the following is the correct way to define a member function outside the class definition in C++?";
        questions[80][1] = "void ClassName::funcName() {}";
        questions[80][2] = "void funcName() {}";
        questions[80][3] = "funcName() {}";
        questions[80][4] = "ClassName::funcName() {}";
        answers[80][0] = "void ClassName::funcName() {}";

        questions[81][0] = "Which of the following is the correct way to declare a friend class in C++?";
        questions[81][1] = "friend class ClassName;";
        questions[81][2] = "class friend ClassName;";
        questions[81][3] = "ClassName friend class;";
        questions[81][4] = "class ClassName friend;";
        answers[81][0] = "friend class ClassName;";

        questions[82][0] = "Which of the following is used to initialize an object in C++?";
        questions[82][1] = "constructor";
        questions[82][2] = "initializer";
        questions[82][3] = "initializer list";
        questions[82][4] = "constructor list";
        answers[82][0] = "initializer list";

        questions[83][0] = "Which of the following is used to check the size of a data type in C++?";
        questions[83][1] = "sizeof";
        questions[83][2] = "size";
        questions[83][3] = "length";
        questions[83][4] = "data_size";
        answers[83][0] = "sizeof";

        questions[84][0] = "Which of the following is the correct way to declare a template class in C++?";
        questions[84][1] = "template <typename T> class ClassName {};";
        questions[84][2] = "class ClassName<template T> {};";
        questions[84][3] = "template class ClassName<T> {};";
        questions[84][4] = "class template <T> ClassName {};";
        answers[84][0] = "template <typename T> class ClassName {};";

        questions[85][0] = "Which of the following is the correct way to declare a template function in C++?";
        questions[85][1] = "template <typename T> void functionName(T arg) {};";
        questions[85][2] = "void template functionName<T>(T arg) {};";
        questions[85][3] = "void functionName<template T>(T arg) {};";
        questions[85][4] = "template void functionName(T arg) {};";
        answers[85][0] = "template <typename T> void functionName(T arg) {};";

        questions[86][0] = "Which of the following is the correct way to declare an abstract class in C++?";
        questions[86][1] = "class AbstractClass { virtual void func() = 0; };";
        questions[86][2] = "class AbstractClass { void virtual func() = 0; };";
        questions[86][3] = "abstract class AbstractClass { void func() = 0; };";
        questions[86][4] = "class AbstractClass { abstract void func() = 0; };";
        answers[86][0] = "class AbstractClass { virtual void func() = 0; };";

        questions[87][0] = "Which of the following is used to include the contents of another file in C++?";
        questions[87][1] = "#include";
        questions[87][2] = "#define";
        questions[87][3] = "#import";
        questions[87][4] = "#source";
        answers[87][0] = "#include";

        questions[88][0] = "Which of the following is the correct way to define a namespace in C++?";
        questions[88][1] = "namespace MyNamespace {}";
        questions[88][2] = "namespace {} MyNamespace";
        questions[88][3] = "namespace MyNamespace";
        questions[88][4] = "namespace MyNamespace;";
        answers[88][0] = "namespace MyNamespace {}";

        questions[89][0] = "Which of the following is used to represent a boolean type in C++?";
        questions[89][1] = "bool";
        questions[89][2] = "boolean";
        questions[89][3] = "bool_t";
        questions[89][4] = "bit";
        answers[89][0] = "bool";

        questions[90][0] = "Which of the following is the correct way to declare an enumeration in C++?";
        questions[90][1] = "enum MyEnum { VALUE1, VALUE2 };";
        questions[90][2] = "enum MyEnum = { VALUE1, VALUE2 };";
        questions[90][3] = "enum MyEnum : int { VALUE1, VALUE2 };";
        questions[90][4] = "enum { MyEnum : int { VALUE1, VALUE2 };";
        answers[90][0] = "enum MyEnum { VALUE1, VALUE2 };";

        questions[91][0] = "Which of the following is the correct way to use a 'switch' statement in C++?";
        questions[91][1] = "switch (x) { case 1: break; default: break; }";
        questions[91][2] = "case x: break;";
        questions[91][3] = "switch (x): case 1: break; default: break;";
        questions[91][4] = "switch (x) { case 1: break; }";
        answers[91][0] = "switch (x) { case 1: break; default: break; }";

        questions[92][0] = "Which of the following is used to define a constant pointer in C++?";
        questions[92][1] = "const int *ptr;";
        questions[92][2] = "int *const ptr;";
        questions[92][3] = "const *int ptr;";
        questions[92][4] = "int const *ptr;";
        answers[92][0] = "const int *ptr;";

        questions[93][0] = "Which of the following is the correct syntax for a function pointer in C++?";
        questions[93][1] = "void (*ptr)();";
        questions[93][2] = "(*void ptr)();";
        questions[93][3] = "void (ptr)();";
        questions[93][4] = "void *ptr();";
        answers[93][0] = "void (*ptr)();";

        questions[94][0] = "Which of the following is the correct way to declare a reference to a constant in C++?";
        questions[94][1] = "const int &ref = value;";
        questions[94][2] = "int &const ref = value;";
        questions[94][3] = "const ref &int = value;";
        questions[94][4] = "ref int const = value;";
        answers[94][0] = "const int &ref = value;";

        questions[95][0] = "Which of the following is used to open a file in C++?";
        questions[95][1] = "std::ifstream";
        questions[95][2] = "std::ofstream";
        questions[95][3] = "std::fstream";
        questions[95][4] = "std::file";
        answers[95][0] = "std::fstream";

        questions[96][0] = "Which of the following is the correct syntax to read from a file in C++?";
        questions[96][1] = "file >> data;";
        questions[96][2] = "read(file, data);";
        questions[96][3] = "file.read(data);";
        questions[96][4] = "data << file;";
        answers[96][0] = "file >> data;";

        questions[97][0] = "Which of the following is used to handle file opening errors in C++?";
        questions[97][1] = "file.fail()";
        questions[97][2] = "file.bad()";
        questions[97][3] = "file.open_error()";
        questions[97][4] = "file.error()";
        answers[97][0] = "file.fail()";

        questions[98][0] = "Which header file is used to work with strings in C++?";
        questions[98][1] = "<string>";
        questions[98][2] = "<cstring>";
        questions[98][3] = "<iostream>";
        questions[98][4] = "<sstream>";
        answers[98][0] = "<string>";

        questions[99][0] = "Which of the following is the correct way to find the length of a string in C++?";
        questions[99][1] = "str.length()";
        questions[99][2] = "length(str)";
        questions[99][3] = "strlen(str)";
        questions[99][4] = "len(str)";
        answers[99][0] = "str.length()";
    }

    public String[][] getQuestions() {
        return questions;
    }

    public String[][] getAnswers() {
        return answers;
    }
}