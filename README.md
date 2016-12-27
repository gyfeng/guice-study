## guice-study
Guice学习Demo

## 学习笔记
1. 不可绑定为自己的类型，比如bind(A.class).to(A.class)，这样在guice中不允许。
- Linked Bindings,可级联的绑定（不知道这样理解对不）。若A有绑定为A1类型，A1类绑定为A2类型，则获取A类型实例的时候会获取到A2类型实例。
- 可使用 BindingAnnotation 注解的注解来指定注入类型。也可通过Named来指定。但都需要在configure方法中进行指定。
- 通过toInstance来指定绑定的实例对象。