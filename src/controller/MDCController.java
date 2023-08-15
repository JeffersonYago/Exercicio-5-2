package controller;

public class MDCController {

	public MDCController() {
		super();
	}
	public int Mdc(int a, int b) {
		if(a == b) {
// quando "a" for igual a "b" significa que o divisor comum entre os dois foi encontrado
			return a;
		}
		else {
			if (a > b) {
				a = a-b;
			}
			return Mdc(b,a);
// se for confirmado que "a" é maior que "b", seu valor será subtraído de "b" e ambos serão invertidos á cada chamada 
		}
	}
}