package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {

	/**
	 * Complete con su implementación
	 */
	private String texto;
	private boolean destacado;
	private int cantidadDeLike;

	public WallPostImpl() {
		this.texto = "Undefined post";
//		this.destacado = false;
//		this.cantidadDeLike = 0;
	}

	/*
	 * Retorna el texto descriptivo de la publicación
	 */
	public String getText() {
		return this.texto;
	}

	/*
	 * Asigna el texto descriptivo de la publicación
	 */
	public void setText(String descriptionText) {
		this.texto = descriptionText;
	}

	/*
	 * Retorna la cantidad de “me gusta”
	 */
	public int getLikes() {
		return this.cantidadDeLike;
	}

	/*
	 * Incrementa la cantidad de likes en uno.
	 */
	public void like() {
		this.cantidadDeLike += 1;
	}

	/*
	 * Decrementa la cantidad de likes en uno. Si ya es 0, no hace nada.
	 */
	public void dislike() {
		if (this.cantidadDeLike > 0) {
			this.cantidadDeLike -= 1;
		}
	}

	/*
	 * Retorna true si el post está marcado como destacado, false en caso contrario
	 */
	public boolean isFeatured() {
		return this.destacado;
	}

	/*
	  Cambia el post del estado destacado a no destacado y viceversa.
	 */
	public void toggleFeatured() {
		destacado= !destacado;

	}

	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de
	 * forma adecuada
	 */
	@Override
	public String toString() {
		return "WallPost {" + "text: " + getText() + ", likes: '" + getLikes() + "'" + ", featured: '" + isFeatured()
				+ "'" + "}";
	}

}
