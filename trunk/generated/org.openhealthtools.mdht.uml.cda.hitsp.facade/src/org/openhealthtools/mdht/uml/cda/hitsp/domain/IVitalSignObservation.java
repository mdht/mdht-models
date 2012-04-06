/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.domain;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.PQ;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vital Sign Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A vital signs observation is a simple observation that uses a specific vocabulary, and inherits
 * constraints from CCD.
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getVitalSignObservation()
 * @generated
 */
public interface IVitalSignObservation extends ISimpleObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Result Observation SHALL contain at least one [1..*] id (CONF-409).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVitalSignObservation addId(II value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Vital Sign Observation SHALL contain exactly one [1..1] code (CodeSystem: 2.16.840.1.113883.6.1 LOINC) (6.3.4.22.3).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVitalSignObservation setCode(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::statusCode.
	 * self.statusCode.oclAsType(datatypes::CS)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CS getStatusCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Result Observation SHALL contain exactly one [1..1] statusCode (CONF-410).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CS withStatusCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Result Observation SHALL contain exactly one [1..1] statusCode (CONF-410).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVitalSignObservation setStatusCode(CS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::effectiveTime.
	 * Represents the biologically relevant time (e.g. time the specimen was obtained from the patient).
	 * self.effectiveTime.oclAsType(datatypes::IVL_TS)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_TS getEffectiveTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Result Observation SHOULD contain exactly one [1..1] effectiveTime (CONF-411).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVL_TS withEffectiveTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Result Observation SHOULD contain exactly one [1..1] effectiveTime (CONF-411).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVitalSignObservation setEffectiveTime(IVL_TS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::value.
	 * self.value.oclAsType(datatypes::PQ)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	PQ getValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Vital Sign Observation SHALL contain exactly one [1..1] value, where its data type is PQ (6.3.4.22.4).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	PQ withValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Vital Sign Observation SHALL contain exactly one [1..1] value, where its data type is PQ (6.3.4.22.4).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVitalSignObservation setValue(PQ value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::interpretationCode.
	 * The interpretation code may be present to provide an interpretation of the vital signs measure (e.g., High, Normal, Low, et cetera).
	 * self.interpretationCode.oclAsType(datatypes::CE)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<CE> getInterpretationCodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Vital Sign Observation MAY contain zero or more [0..*] interpretationCode (6.3.4.22.5).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CE addInterpretationCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Vital Sign Observation MAY contain zero or more [0..*] interpretationCode (6.3.4.22.5).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVitalSignObservation addInterpretationCode(CE value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::methodCode.
	 * The method code element may be present to indicate the method used to obtain the measure. Note that method used is distinct from, but possibly related to the target site.
	 * self.methodCode.oclAsType(datatypes::CE)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CE getMethodCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Vital Sign Observation MAY contain zero or one [0..1] methodCode (6.3.4.22.6).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CE withMethodCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Vital Sign Observation MAY contain zero or one [0..1] methodCode (6.3.4.22.6).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVitalSignObservation setMethodCode(CE value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::targetSiteCode.
	 * The target site of the measure may be identified in the targetSiteCode element (e.g., Left arm [blood pressure], oral [temperature], et cetera).
	 * self.targetSiteCode.oclAsType(datatypes::CD)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<CD> getTargetSiteCodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Vital Sign Observation MAY contain zero or more [0..*] targetSiteCode (6.3.4.22.7).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD addTargetSiteCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Vital Sign Observation MAY contain zero or more [0..*] targetSiteCode (6.3.4.22.7).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVitalSignObservation addTargetSiteCode(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVitalSignObservation init();
} // IVitalSignObservation
