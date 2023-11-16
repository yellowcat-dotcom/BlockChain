public class Main {
    public static void main(String[] args) {
        Blockchain blockchain = new Blockchain(4);
        blockchain.addBlock(blockchain.newBlock("Second Block"));
        blockchain.addBlock(blockchain.newBlock("Third Block"));
        blockchain.addBlock(blockchain.newBlock("Fourth Block"));

        System.out.println("Blockchain valid ? " + blockchain.isBlockChainValid());
        System.out.println(blockchain);


        blockchain.addBlock(new Block(15, System.currentTimeMillis(), "aaaabbb", "Block invalid"));

        System.out.println("Blockchain valid ? " + blockchain.isBlockChainValid());
    }
}
//необходимо распараллелить, каждый блок должен содержать свою очередь, написать этот код с MPI