package digittal.signature.rsa;

//package atnf.atoms.mon.util;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class AlgorithmRSA {
    private BigInteger n, d, e;
    public BigInteger getN() {
        return n;
    }
}
