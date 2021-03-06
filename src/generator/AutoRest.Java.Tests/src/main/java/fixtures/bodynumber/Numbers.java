/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodynumber;

import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.bodynumber.models.ErrorException;
import java.io.IOException;
import java.math.BigDecimal;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Numbers.
 */
public interface Numbers {
    /**
     * Get null Number value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the double object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Double> getNull() throws ErrorException, IOException;

    /**
     * Get null Number value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Double> getNullAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Get null Number value.
     *
     * @return the observable to the double object
     */
    Observable<ServiceResponse<Double>> getNullAsync();

    /**
     * Get invalid float Number value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the double object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Double> getInvalidFloat() throws ErrorException, IOException;

    /**
     * Get invalid float Number value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Double> getInvalidFloatAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Get invalid float Number value.
     *
     * @return the observable to the double object
     */
    Observable<ServiceResponse<Double>> getInvalidFloatAsync();

    /**
     * Get invalid double Number value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the double object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Double> getInvalidDouble() throws ErrorException, IOException;

    /**
     * Get invalid double Number value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Double> getInvalidDoubleAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Get invalid double Number value.
     *
     * @return the observable to the double object
     */
    Observable<ServiceResponse<Double>> getInvalidDoubleAsync();

    /**
     * Get invalid decimal Number value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the BigDecimal object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<BigDecimal> getInvalidDecimal() throws ErrorException, IOException;

    /**
     * Get invalid decimal Number value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<BigDecimal> getInvalidDecimalAsync(final ServiceCallback<BigDecimal> serviceCallback);

    /**
     * Get invalid decimal Number value.
     *
     * @return the observable to the BigDecimal object
     */
    Observable<ServiceResponse<BigDecimal>> getInvalidDecimalAsync();

    /**
     * Put big float value 3.402823e+20.
     *
     * @param numberBody the double value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putBigFloat(double numberBody) throws ErrorException, IOException;

    /**
     * Put big float value 3.402823e+20.
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putBigFloatAsync(double numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put big float value 3.402823e+20.
     *
     * @param numberBody the double value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putBigFloatAsync(double numberBody);

    /**
     * Get big float value 3.402823e+20.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the double object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Double> getBigFloat() throws ErrorException, IOException;

    /**
     * Get big float value 3.402823e+20.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Double> getBigFloatAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Get big float value 3.402823e+20.
     *
     * @return the observable to the double object
     */
    Observable<ServiceResponse<Double>> getBigFloatAsync();

    /**
     * Put big double value 2.5976931e+101.
     *
     * @param numberBody the double value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putBigDouble(double numberBody) throws ErrorException, IOException;

    /**
     * Put big double value 2.5976931e+101.
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putBigDoubleAsync(double numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put big double value 2.5976931e+101.
     *
     * @param numberBody the double value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putBigDoubleAsync(double numberBody);

    /**
     * Get big double value 2.5976931e+101.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the double object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Double> getBigDouble() throws ErrorException, IOException;

    /**
     * Get big double value 2.5976931e+101.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Double> getBigDoubleAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Get big double value 2.5976931e+101.
     *
     * @return the observable to the double object
     */
    Observable<ServiceResponse<Double>> getBigDoubleAsync();

    /**
     * Put big double value 99999999.99.
     *
     * @param numberBody the double value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putBigDoublePositiveDecimal(double numberBody) throws ErrorException, IOException;

    /**
     * Put big double value 99999999.99.
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putBigDoublePositiveDecimalAsync(double numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put big double value 99999999.99.
     *
     * @param numberBody the double value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putBigDoublePositiveDecimalAsync(double numberBody);

    /**
     * Get big double value 99999999.99.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the double object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Double> getBigDoublePositiveDecimal() throws ErrorException, IOException;

    /**
     * Get big double value 99999999.99.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Double> getBigDoublePositiveDecimalAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Get big double value 99999999.99.
     *
     * @return the observable to the double object
     */
    Observable<ServiceResponse<Double>> getBigDoublePositiveDecimalAsync();

    /**
     * Put big double value -99999999.99.
     *
     * @param numberBody the double value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putBigDoubleNegativeDecimal(double numberBody) throws ErrorException, IOException;

    /**
     * Put big double value -99999999.99.
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putBigDoubleNegativeDecimalAsync(double numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put big double value -99999999.99.
     *
     * @param numberBody the double value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putBigDoubleNegativeDecimalAsync(double numberBody);

    /**
     * Get big double value -99999999.99.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the double object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Double> getBigDoubleNegativeDecimal() throws ErrorException, IOException;

    /**
     * Get big double value -99999999.99.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Double> getBigDoubleNegativeDecimalAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Get big double value -99999999.99.
     *
     * @return the observable to the double object
     */
    Observable<ServiceResponse<Double>> getBigDoubleNegativeDecimalAsync();

    /**
     * Put big decimal value 2.5976931e+101.
     *
     * @param numberBody the BigDecimal value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putBigDecimal(BigDecimal numberBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put big decimal value 2.5976931e+101.
     *
     * @param numberBody the BigDecimal value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putBigDecimalAsync(BigDecimal numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put big decimal value 2.5976931e+101.
     *
     * @param numberBody the BigDecimal value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putBigDecimalAsync(BigDecimal numberBody);

    /**
     * Get big decimal value 2.5976931e+101.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the BigDecimal object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<BigDecimal> getBigDecimal() throws ErrorException, IOException;

    /**
     * Get big decimal value 2.5976931e+101.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<BigDecimal> getBigDecimalAsync(final ServiceCallback<BigDecimal> serviceCallback);

    /**
     * Get big decimal value 2.5976931e+101.
     *
     * @return the observable to the BigDecimal object
     */
    Observable<ServiceResponse<BigDecimal>> getBigDecimalAsync();

    /**
     * Put big decimal value 99999999.99.
     *
     * @param numberBody the BigDecimal value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putBigDecimalPositiveDecimal(BigDecimal numberBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put big decimal value 99999999.99.
     *
     * @param numberBody the BigDecimal value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putBigDecimalPositiveDecimalAsync(BigDecimal numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put big decimal value 99999999.99.
     *
     * @param numberBody the BigDecimal value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putBigDecimalPositiveDecimalAsync(BigDecimal numberBody);

    /**
     * Get big decimal value 99999999.99.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the BigDecimal object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<BigDecimal> getBigDecimalPositiveDecimal() throws ErrorException, IOException;

    /**
     * Get big decimal value 99999999.99.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<BigDecimal> getBigDecimalPositiveDecimalAsync(final ServiceCallback<BigDecimal> serviceCallback);

    /**
     * Get big decimal value 99999999.99.
     *
     * @return the observable to the BigDecimal object
     */
    Observable<ServiceResponse<BigDecimal>> getBigDecimalPositiveDecimalAsync();

    /**
     * Put big decimal value -99999999.99.
     *
     * @param numberBody the BigDecimal value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putBigDecimalNegativeDecimal(BigDecimal numberBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put big decimal value -99999999.99.
     *
     * @param numberBody the BigDecimal value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putBigDecimalNegativeDecimalAsync(BigDecimal numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put big decimal value -99999999.99.
     *
     * @param numberBody the BigDecimal value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putBigDecimalNegativeDecimalAsync(BigDecimal numberBody);

    /**
     * Get big decimal value -99999999.99.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the BigDecimal object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<BigDecimal> getBigDecimalNegativeDecimal() throws ErrorException, IOException;

    /**
     * Get big decimal value -99999999.99.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<BigDecimal> getBigDecimalNegativeDecimalAsync(final ServiceCallback<BigDecimal> serviceCallback);

    /**
     * Get big decimal value -99999999.99.
     *
     * @return the observable to the BigDecimal object
     */
    Observable<ServiceResponse<BigDecimal>> getBigDecimalNegativeDecimalAsync();

    /**
     * Put small float value 3.402823e-20.
     *
     * @param numberBody the double value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putSmallFloat(double numberBody) throws ErrorException, IOException;

    /**
     * Put small float value 3.402823e-20.
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putSmallFloatAsync(double numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put small float value 3.402823e-20.
     *
     * @param numberBody the double value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putSmallFloatAsync(double numberBody);

    /**
     * Get big double value 3.402823e-20.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the double object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Double> getSmallFloat() throws ErrorException, IOException;

    /**
     * Get big double value 3.402823e-20.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Double> getSmallFloatAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Get big double value 3.402823e-20.
     *
     * @return the observable to the double object
     */
    Observable<ServiceResponse<Double>> getSmallFloatAsync();

    /**
     * Put small double value 2.5976931e-101.
     *
     * @param numberBody the double value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putSmallDouble(double numberBody) throws ErrorException, IOException;

    /**
     * Put small double value 2.5976931e-101.
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putSmallDoubleAsync(double numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put small double value 2.5976931e-101.
     *
     * @param numberBody the double value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putSmallDoubleAsync(double numberBody);

    /**
     * Get big double value 2.5976931e-101.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the double object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Double> getSmallDouble() throws ErrorException, IOException;

    /**
     * Get big double value 2.5976931e-101.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Double> getSmallDoubleAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Get big double value 2.5976931e-101.
     *
     * @return the observable to the double object
     */
    Observable<ServiceResponse<Double>> getSmallDoubleAsync();

    /**
     * Put small decimal value 2.5976931e-101.
     *
     * @param numberBody the BigDecimal value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putSmallDecimal(BigDecimal numberBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put small decimal value 2.5976931e-101.
     *
     * @param numberBody the BigDecimal value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putSmallDecimalAsync(BigDecimal numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put small decimal value 2.5976931e-101.
     *
     * @param numberBody the BigDecimal value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> putSmallDecimalAsync(BigDecimal numberBody);

    /**
     * Get small decimal value 2.5976931e-101.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the BigDecimal object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<BigDecimal> getSmallDecimal() throws ErrorException, IOException;

    /**
     * Get small decimal value 2.5976931e-101.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<BigDecimal> getSmallDecimalAsync(final ServiceCallback<BigDecimal> serviceCallback);

    /**
     * Get small decimal value 2.5976931e-101.
     *
     * @return the observable to the BigDecimal object
     */
    Observable<ServiceResponse<BigDecimal>> getSmallDecimalAsync();

}
