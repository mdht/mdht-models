/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.toc.domain;

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
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.domain.ISeverity#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getSeverity()
 * @generated
 */
public interface ISeverity {
	/**
	 * Returns the value of the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDA Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDA Type</em>' reference.
	 * @see #setCDAType(Observation)
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getSeverity_CDAType()
	 * @generated
	 */
	Observation getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ISeverity#getCDAType <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CDA Type</em>' reference.
	 * @see #getCDAType()
	 * @generated
	 */
	void setCDAType(Observation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::text.
	 * self.text.oclAsType(datatypes::ED)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ED getText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Severity SHALL contain exactly one [1..1] text.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ED withText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Severity SHALL contain exactly one [1..1] text.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISeverity setText(ED value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::value.
	 * Value code representing high, moderate and low severity depending upon whether the severity is life threatening, presents noticeable adverse consequences, or is unlikely substantially effect the situation of the subject.
	 * self.value.oclAsType(datatypes::CD)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD getValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Severity SHALL contain exactly one [1..1] value, which SHALL be selected from ValueSet SeverityObservation STATIC, where its data type is CD.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD withValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Severity SHALL contain exactly one [1..1] value, which SHALL be selected from ValueSet SeverityObservation STATIC, where its data type is CD.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ISeverity setValue(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISeverity init();
} // ISeverity
