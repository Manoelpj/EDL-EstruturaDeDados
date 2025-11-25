package VetLisSeq.vetor.vetorImplementacao.vetorArray;

public interface Vetor{
        public Object elemAtRank(int rank) throws VetorVazioExpection;

        public Object replaceAtRank(int rank, Object objeto) throws VetorVazioExpection;

        public void insertAtRank(int rank, Object objeto) throws VetorOutRangeException;

        public Object removeAtRank(int rank) throws VetorVazioExpection;

        public int size();

        public boolean isEmpty();
} 
