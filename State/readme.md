#  参与者

1. Context（环境，如 TCPConnection)

   一定义客户感兴趣的接口。

   一维护一个 Concretestate 子类的实例，这个实例定义当前状态。

2. State（状态，如 TCPState)

   一定义一个接口以封装与 Context 的一个特定状态相关的行为。

3. Concrete State subclasses（具体状态子类，如 TCPEstablished、TCPListen、TCP Closed)

   一每一于类实现一个与 Context 的一个状态相关的行为。

#  协作

1. Context 将与状态相关的请求委托给当前的 ConcreteState 对象处理。
2. Context 可将自身作为一个参数传递给处理该请求的状态对象。这使得状态对象在必要时可访间 Contexto
3. Context 是客户使用的主要接口。客户可用状态对象来配置一个Context，一旦一个Context 配置完毕，它的客户不再需要直接与状态对象打交道。
4. Coniext 或 ConcreteState子类都可决定哪个状态是另外一个的后继者，以及是在何种条件下进行状态转换。
