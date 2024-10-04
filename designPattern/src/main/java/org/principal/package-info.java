/**
 * <strong>principal-info</strong><br>
 * <strong>1. 单一职责原则——一个类有且仅有一个改变其的理由</strong><br>
 * AreaCalculator类仅负责计算形状面积，PerimeterCalculator类仅负责计算形状周长；<br>
 * <strong>2. 开放封闭原则——对扩展开放对修改封闭</strong><br>
 * AreaCalculator、PerimeterCalculator类可以处理任何实现Shape接口的图形类，若需增加新的形状，只需要添加新的图形类并实现Shape接口，并根据具体形状的特性实现具体计算逻辑即可;<br>
 * <strong>3. 依赖倒置原则——具体实现依赖于抽象，而不是抽象依赖于实现</strong><br>
 * AreaCalculator、PerimeterCalculator依赖于Shape接口，与具体形状实现解耦，提高系统灵活性与扩展性;<br>
 * <strong>4. 接口隔离原则——使用多个专业接口替代通用总接口</strong><br>
 * Shape接口仅负责计算周长与面积，满足不应该强迫一个类依赖于其不使用的方法<br>
 * <strong>5. 里氏替换原则——</strong><br>
 * <br>
 * <strong>6. 迪米特法则——</strong><br>
 * <br>
 */
package org.principal;
