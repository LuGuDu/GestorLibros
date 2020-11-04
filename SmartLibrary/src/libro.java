public class libro {
		
		private String titulo;
		private String autor;
		private String editorial;
		
		public libro(String titulo, String autor, String editorial) {	
			this.titulo = titulo;
			this.autor = autor;
			this.editorial = editorial;			
		}

		public String get_titulo() {
			return titulo;
		}
		
		public String get_autor() {
			return autor;
		}
		
		public String get_editorial() {
			return editorial;
		}
		
		public String toString() {
			return "Titulo: "+titulo+"; Autor: "+autor+"; Editorial: "+editorial;
		}
		
}
