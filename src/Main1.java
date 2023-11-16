public class Main1 {

    public static void main(String[] args) {
        Blockchain blockchain = new Blockchain(4);
        blockchain.addBlock(blockchain.newBlock("Second Block"));
        blockchain.addBlock(blockchain.newBlock("Third Block"));
        blockchain.addBlock(blockchain.newBlock("Fourth Block"));

        System.out.println("Blockchain valid ? " + blockchain.isBlockChainValid());
        System.out.println(blockchain);
    }

}