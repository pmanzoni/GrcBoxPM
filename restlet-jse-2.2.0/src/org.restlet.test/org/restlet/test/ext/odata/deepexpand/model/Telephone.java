/**
 * Copyright 2005-2014 Restlet
 * 
 * The contents of this file are subject to the terms of one of the following
 * open source licenses: Apache 2.0 or LGPL 3.0 or LGPL 2.1 or CDDL 1.0 or EPL
 * 1.0 (the "Licenses"). You can select the license that you prefer but you may
 * not use this file except in compliance with one of these Licenses.
 * 
 * You can obtain a copy of the Apache 2.0 license at
 * http://www.opensource.org/licenses/apache-2.0
 * 
 * You can obtain a copy of the LGPL 3.0 license at
 * http://www.opensource.org/licenses/lgpl-3.0
 * 
 * You can obtain a copy of the LGPL 2.1 license at
 * http://www.opensource.org/licenses/lgpl-2.1
 * 
 * You can obtain a copy of the CDDL 1.0 license at
 * http://www.opensource.org/licenses/cddl1
 * 
 * You can obtain a copy of the EPL 1.0 license at
 * http://www.opensource.org/licenses/eclipse-1.0
 * 
 * See the Licenses for the specific language governing permissions and
 * limitations under the Licenses.
 * 
 * Alternatively, you can obtain a royalty free commercial license with less
 * limitations, transferable or non-transferable, directly at
 * http://www.restlet.com/products/restlet-framework
 * 
 * Restlet is a registered trademark of Restlet
 */

package org.restlet.test.ext.odata.deepexpand.model;


import org.restlet.test.ext.odata.deepexpand.model.Person;

/**
* Generated by the generator tool for the OData extension for the Restlet framework.<br>
*
* @see <a href="http://praktiki.metal.ntua.gr/CoopOData/CoopOData.svc/$metadata">Metadata of the target OData service</a>
*
*/
public class Telephone {

    private String comment;
    private int id;
    private String number;
    private String type;
    private Tracking tracking;
    private Person person;

    /**
     * Constructor without parameter.
     * 
     */
    public Telephone() {
        super();
    }

    /**
     * Constructor.
     * 
     * @param id
     *            The identifiant value of the entity.
     */
    public Telephone(int id) {
        this();
        this.id = id;
    }

   /**
    * Returns the value of the "comment" attribute.
    *
    * @return The value of the "comment" attribute.
    */
   public String getComment() {
      return comment;
   }
   /**
    * Returns the value of the "id" attribute.
    *
    * @return The value of the "id" attribute.
    */
   public int getId() {
      return id;
   }
   /**
    * Returns the value of the "number" attribute.
    *
    * @return The value of the "number" attribute.
    */
   public String getNumber() {
      return number;
   }
   /**
    * Returns the value of the "type" attribute.
    *
    * @return The value of the "type" attribute.
    */
   public String getType() {
      return type;
   }
   /**
    * Returns the value of the "tracking" attribute.
    *
    * @return The value of the "tracking" attribute.
    */
   public Tracking getTracking() {
      return tracking;
   }
   /**
    * Returns the value of the "person" attribute.
    *
    * @return The value of the "person" attribute.
    */
   public Person getPerson() {
      return person;
   }
   
   /**
    * Sets the value of the "comment" attribute.
    *
    * @param comment
    *     The value of the "comment" attribute.
    */
   public void setComment(String comment) {
      this.comment = comment;
   }
   /**
    * Sets the value of the "id" attribute.
    *
    * @param id
    *     The value of the "id" attribute.
    */
   public void setId(int id) {
      this.id = id;
   }
   /**
    * Sets the value of the "number" attribute.
    *
    * @param number
    *     The value of the "number" attribute.
    */
   public void setNumber(String number) {
      this.number = number;
   }
   /**
    * Sets the value of the "type" attribute.
    *
    * @param type
    *     The value of the "type" attribute.
    */
   public void setType(String type) {
      this.type = type;
   }
   /**
    * Sets the value of the "tracking" attribute.
    *
    * @param tracking
    *     The value of the "tracking" attribute.
    */
   public void setTracking(Tracking tracking) {
      this.tracking = tracking;
   }
   
   /**
    * Sets the value of the "person" attribute.
    *
    * @param person"
    *     The value of the "person" attribute.
    */
   public void setPerson(Person person) {
      this.person = person;
   }

}