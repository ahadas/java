/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.15.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubernetes.client.openapi.models;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategy;
import io.kubernetes.client.openapi.models.V1LabelSelector;
import io.kubernetes.client.openapi.models.V1PodTemplateSpec;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DaemonSetSpec is the specification of a daemon set.
 */
@ApiModel(description = "DaemonSetSpec is the specification of a daemon set.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-06T10:41:07.822Z[Etc/UTC]")
public class V1DaemonSetSpec {
  public static final String SERIALIZED_NAME_MIN_READY_SECONDS = "minReadySeconds";
  @SerializedName(SERIALIZED_NAME_MIN_READY_SECONDS)
  private Integer minReadySeconds;

  public static final String SERIALIZED_NAME_REVISION_HISTORY_LIMIT = "revisionHistoryLimit";
  @SerializedName(SERIALIZED_NAME_REVISION_HISTORY_LIMIT)
  private Integer revisionHistoryLimit;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";
  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private V1LabelSelector selector;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private V1PodTemplateSpec template;

  public static final String SERIALIZED_NAME_UPDATE_STRATEGY = "updateStrategy";
  @SerializedName(SERIALIZED_NAME_UPDATE_STRATEGY)
  private V1DaemonSetUpdateStrategy updateStrategy;


  public V1DaemonSetSpec minReadySeconds(Integer minReadySeconds) {
    
    this.minReadySeconds = minReadySeconds;
    return this;
  }

   /**
   * The minimum number of seconds for which a newly created DaemonSet pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready).
   * @return minReadySeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The minimum number of seconds for which a newly created DaemonSet pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready).")

  public Integer getMinReadySeconds() {
    return minReadySeconds;
  }


  public void setMinReadySeconds(Integer minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
  }


  public V1DaemonSetSpec revisionHistoryLimit(Integer revisionHistoryLimit) {
    
    this.revisionHistoryLimit = revisionHistoryLimit;
    return this;
  }

   /**
   * The number of old history to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
   * @return revisionHistoryLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of old history to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.")

  public Integer getRevisionHistoryLimit() {
    return revisionHistoryLimit;
  }


  public void setRevisionHistoryLimit(Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
  }


  public V1DaemonSetSpec selector(V1LabelSelector selector) {
    
    this.selector = selector;
    return this;
  }

   /**
   * Get selector
   * @return selector
  **/
  @ApiModelProperty(required = true, value = "")

  public V1LabelSelector getSelector() {
    return selector;
  }


  public void setSelector(V1LabelSelector selector) {
    this.selector = selector;
  }


  public V1DaemonSetSpec template(V1PodTemplateSpec template) {
    
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @ApiModelProperty(required = true, value = "")

  public V1PodTemplateSpec getTemplate() {
    return template;
  }


  public void setTemplate(V1PodTemplateSpec template) {
    this.template = template;
  }


  public V1DaemonSetSpec updateStrategy(V1DaemonSetUpdateStrategy updateStrategy) {
    
    this.updateStrategy = updateStrategy;
    return this;
  }

   /**
   * Get updateStrategy
   * @return updateStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1DaemonSetUpdateStrategy getUpdateStrategy() {
    return updateStrategy;
  }


  public void setUpdateStrategy(V1DaemonSetUpdateStrategy updateStrategy) {
    this.updateStrategy = updateStrategy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    return EqualsBuilder.reflectionEquals(this, o);
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DaemonSetSpec {\n");
    sb.append("    minReadySeconds: ").append(toIndentedString(minReadySeconds)).append("\n");
    sb.append("    revisionHistoryLimit: ").append(toIndentedString(revisionHistoryLimit)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    updateStrategy: ").append(toIndentedString(updateStrategy)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

