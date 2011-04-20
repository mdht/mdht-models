/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.apitest.domain;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Severity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This specification models a severity observation as a separate observation from the condition. While this model is different from work presently underway by various organizations (i.e., SNOMED, HL7, TermInfo), it is not wholly incompatible with that work. In that work, qualifiers may be used to identify severity in the coded condition observation, and a separate severity observation is no longer necessary. The use of qualifiers is not precluded by this specification. However, to support semantic interoperability between EMR systems using different vocabularies, this specification does require that severity information also be provided in a separate observation. This ensures that all EMR systems have equal access to the information, regardless of the vocabularies they support.
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage#getSeverity()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Severity extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Observation toCDAType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	ED getText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>SHALL</b> contain exactly one [1..1] <tt><b>text</b></tt></p>
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	Severity setText(ED value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Value code representing high, moderate and low severity depending upon whether the severity is life threatening, presents noticeable adverse consequences, or is unlikely substantially effect the situation of the subject.
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	CD getValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>SHALL</b> contain exactly one [1..1] <tt><b>value</b></tt>, which <b>SHALL</b> be selected from ValueSet<tt> SeverityObservation</tt><b> STATIC</b>, where its data type is CD</p>
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	Severity setValue(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Severity init();
} // Severity
