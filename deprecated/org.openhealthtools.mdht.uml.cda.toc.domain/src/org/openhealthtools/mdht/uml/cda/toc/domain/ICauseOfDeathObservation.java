/*******************************************************************************
 * Copyright (c) 2011, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.toc.domain;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cause Of Death Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getCauseOfDeathObservation()
 * @generated
 */
public interface ICauseOfDeathObservation extends IFamilyHistoryObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Family History Observation SHALL contain at least one [1..*] id.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ICauseOfDeathObservation addId(II value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Observation Contains exactly one [1..1] code, where its data type is CD.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ICauseOfDeathObservation setCode(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Family History Observation SHOULD contain zero or one [0..1] effectiveTime.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ICauseOfDeathObservation setEffectiveTime(IVL_TS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Family History Observation MAY contain zero or one [0..1] entryRelationship (CONF-224), such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] Age Observation (templateId: 2.16.840.1.113883.10.20.1.38).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ICauseOfDeathObservation setAgeObservation(IAgeObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Family History Observation MAY contain zero or one [0..1] entryRelationship, such that Contains exactly one [1..1] Problem Status Observation (templateId: 2.16.840.1.113883.10.20.1.50).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ICauseOfDeathObservation setProblemStatusObservation(IProblemStatusObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Family History Observation SHALL contain at least one [1..*] entryRelationship, such that Contains @typeCode="CAUS" CAUS (is etiology for), and Contains exactly one [1..1] Cause Of Death Observation (templateId: 2.16.840.1.113883.10.20.1.42).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ICauseOfDeathObservation addCauseOfDeathObservation(ICauseOfDeathObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICauseOfDeathObservation init();
} // ICauseOfDeathObservation
