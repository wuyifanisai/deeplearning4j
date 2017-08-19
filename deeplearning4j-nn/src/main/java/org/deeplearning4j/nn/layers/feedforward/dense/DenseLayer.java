package org.deeplearning4j.nn.layers.feedforward.dense;

import org.deeplearning4j.nn.conf.NeuralNetConfiguration;
import org.deeplearning4j.nn.layers.BaseLayer;
import org.nd4j.linalg.api.ndarray.INDArray;

/**
 * @author Adam Gibson
 */
public class DenseLayer extends BaseLayer<org.deeplearning4j.nn.conf.layers.DenseLayer> {
    public DenseLayer(NeuralNetConfiguration conf) {
        super(conf);
    }

    public DenseLayer(NeuralNetConfiguration conf, INDArray input) {
        super(conf, input);
    }

    @Override
    public void fit(INDArray input) {}

    @Override
    public boolean isPretrainLayer() {
        return false;
    }

    @Override
    public boolean noBias(){
        return layerConf().isNoBias();
    }
}
