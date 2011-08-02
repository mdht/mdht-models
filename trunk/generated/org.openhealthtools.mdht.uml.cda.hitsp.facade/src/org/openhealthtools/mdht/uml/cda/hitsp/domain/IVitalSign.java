/*******************************************************************************
 * Copyright (c) 2011 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.domain;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.PQ;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vital Sign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 * These entries are used to record current and relevant historical vital signs for the patient. Vital Signs are a subset of <b><i>Results Section</i></b>, but are reported in this section to follow clinical conventions.
 * </p>
 * 
 * <p>
 * The differentiation between Vital Signs and Results varies by clinical context. Common examples of vital signs include temperature, height, weight, blood pressure, etc. However, some clinical contexts may alter these common vitals, for example in neonatology "height" may be replaced by "crown-to-rump" measurement.
 * </p>
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IVitalSign#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getVitalSign()
 * @generated
 */
public interface IVitalSign {
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
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getVitalSign_CDAType()
	 * @generated
	 */
	Observation getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IVitalSign#getCDAType <em>CDA Type</em>}' reference.
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
	 * cda::Observation::id.
	 * self.id.oclAsType(datatypes::II)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<II> getIds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Result Observation SHALL contain at least one [1..*] id (CONF-409).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	II addId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Result Observation SHALL contain at least one [1..*] id (CONF-409).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVitalSign addId(II value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::code.
	 * self.code.oclAsType(datatypes::CD)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD getCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Vital Sign SHALL contain exactly one [1..1] code, which SHALL be selected from ValueSet 2.16.840.1.113883.3.88.12.80.62 Vital Sign Result STATIC 1 (C154-[DE-14.03-1]).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD withCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Vital Sign SHALL contain exactly one [1..1] code, which SHALL be selected from ValueSet 2.16.840.1.113883.3.88.12.80.62 Vital Sign Result STATIC 1 (C154-[DE-14.03-1]).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVitalSign setCode(CD value);

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
	IVitalSign setStatusCode(CS value);

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
	IVitalSign setEffectiveTime(IVL_TS value);

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
	IVitalSign setValue(PQ value);

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
	IVitalSign addInterpretationCode(CE value);

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
	IVitalSign setMethodCode(CE value);

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
	IVitalSign addTargetSiteCode(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVitalSign init();
} // IVitalSign
