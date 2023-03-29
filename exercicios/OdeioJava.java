public class OdeioJava {
    public static void main(String[] args) {
        // ESTÁ DANDO ERRO AO INSTANCIAR O -> "new Zoologico()" e nao entendi o porque
        Zoologico zoologico = new Zoologico();
        Veterinario veterinario = new Veterinario();

        zoologico.visitarZoologico();

        Animal cachorro = new Cachorro("Fido", 2);
        Animal cavalo = new Cavalo("Pegasus", 6);
        Animal preguica = new Preguica("Zzz", 4);

         veterinario.examinar(cachorro);
         veterinario.examinar(cavalo);
         veterinario.examinar(preguica);
    }
    // criar classe animal
    public class Animal {
        public String nome;
        public int idade;
    
        public Animal(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }
    }
    
    public interface EmitirSom {
        void emitirSom();
    }
    
    public interface DeveCorrer {
        void correr();
    }
    
    public interface SobeArvore {
        void subirEmArvore();
    }
    // criar classe veterinario
    public class Veterinario {
        public void examinar(Animal animal) {
            System.out.print("Examinando " + animal.nome + "... ");
            if (animal instanceof EmitirSom) {
                EmitirSom emissorSom = (EmitirSom) animal;
                emissorSom.emitirSom();
            }
        }
    }
    // criar classe zoologico
    public class Zoologico {
        private static final int NUMERO_JAULAS = 10;
        private Animal[] jaulas;
        
    // definindo animais em cada jaula
        public Zoologico() {
            this.jaulas = new Animal[NUMERO_JAULAS];
            jaulas[0] = new Cachorro("Rex", 3);
            jaulas[1] = new Cavalo("Pé de Pano", 5);
            jaulas[2] = new Preguica("Zé", 2);
            jaulas[3] = new Cachorro("Lassie", 4);
            jaulas[4] = new Cavalo("Relâmpago", 6);
            jaulas[5] = new Preguica("Maurício", 1);
            jaulas[6] = new Cachorro("Bidu", 2);
            jaulas[7] = new Cavalo("Spirit", 8);
            jaulas[8] = new Preguica("Sid", 3);
            jaulas[9] = new Cachorro("Toby", 7);
        }
    // algoritmo pra "visitar" as jaulas e visualizar
        public void visitarZoologico() {
            for (int i = 0; i < NUMERO_JAULAS; i++) {
                System.out.println("Visitando jaula " + (i+1) + "...");
                Animal animal = jaulas[i];
                if (animal instanceof DeveCorrer) {
                    DeveCorrer deveCorrer = (DeveCorrer) animal;
                    deveCorrer.correr();
                }
            }
        }
    
    }
    
    
    // criando o objeto cachorro da classe animal
    public class Cachorro extends Animal implements EmitirSom, DeveCorrer {
        public Cachorro(String nome, int idade) {
            super(nome, idade);
        }
    
        public void emitirSom() {
            System.out.println("Au au!");
        }
    
        public void correr() {
            System.out.println("Correndo como um cachorro!");
        }
    }
    // criando o objeto cavalo da classe animal
    public class Cavalo extends Animal implements EmitirSom, DeveCorrer {
        public Cavalo(String nome, int idade) {
            super(nome, idade);
        }
    
        public void emitirSom() {
            System.out.println("Relinchando!");
        }
    
        public void correr() {
            System.out.println("Correndo como um cavalo!");
        }
    }
    // criando o objeto preguica da classe animal
    public class Preguica extends Animal implements EmitirSom, SobeArvore {
        public Preguica(String nome, int idade) {
            super(nome, idade);
        }
    
        public void emitirSom() {
            System.out.println("Bocejo...");
        }
    
        public void subirEmArvore() {
            System.out.println("Subindo devagar em uma árvore...");
        }
    }
    
}
