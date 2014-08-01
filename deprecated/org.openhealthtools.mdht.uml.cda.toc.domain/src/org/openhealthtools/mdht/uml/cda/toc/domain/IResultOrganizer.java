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

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Specimen;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Non-template subclasss of CCD ResultOrganizer that requires entires to be HITSP Result.
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <p>This clinical statement identifies set of result observations. It contains information applicable to all of the contained result observations. Result type codes categorize a result into one of several commonly accepted values (e.g., "Hematology", "Chemistry", "Nuclear Medicine"). These values are often implicit in the <tt>Organizer/code</tt> (e.g., an <tt>Organizer/code</tt> of "complete blood count" implies a <tt>ResultTypeCode</tt> of "Hematology"). This template requires <tt>Organizer/code</tt> to include a <tt>ResultTypeCode</tt> either directly or as a translation of a code from some other code system.</p>
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.domain.IResultOrganizer#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getResultOrganizer()
 * @generated
 */
public interface IResultOrganizer {
	/**
	 * Returns the value of the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDA Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDA Type</em>' reference.
	 * @see #setCDAType(Organizer)
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getResultOrganizer_CDAType()
	 * @generated
	 */
	Organizer getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IResultOrganizer#getCDAType <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CDA Type</em>' reference.
	 * @see #getCDAType()
	 * @generated
	 */
	void setCDAType(Organizer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Organizer::id.
	 * self.id.oclAsType(datatypes::II)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<II> getIds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Result Organizer SHALL contain at least one [1..*] id (CONF-395).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	II addId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Result Organizer SHALL contain at least one [1..*] id (CONF-395).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IResultOrganizer addId(II value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Organizer::code.
	 * self.code.oclAsType(datatypes::CD)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD getCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Result Organizer SHALL contain exactly one [1..1] code (CONF-397).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD withCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Result Organizer SHALL contain exactly one [1..1] code (CONF-397).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IResultOrganizer setCode(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Organizer::statusCode.
	 * self.statusCode.oclAsType(datatypes::CS)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CS getStatusCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Result Organizer SHALL contain exactly one [1..1] statusCode (CONF-396).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CS withStatusCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Result Organizer SHALL contain exactly one [1..1] statusCode (CONF-396).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IResultOrganizer setStatusCode(CS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Organizer::specimen.
	 * Should be included if the specimen isn't inherent in code value.
	 * self.getSpecimens()->select(specimen : cda::Specimen | not specimen.oclIsUndefined() and specimen.oclIsKindOf(cda::Specimen)).oclAsType(cda::Specimen)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<Specimen> getSpecimens();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Result Organizer SHOULD contain at least one [1..*] specimen (CONF-399), such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	Specimen addSpecimen();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Result Organizer SHOULD contain at least one [1..*] specimen (CONF-399), such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IResultOrganizer addSpecimen(Specimen value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * hitsp::ResultOrganizer::result.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::Result)).oclAsType(domain::Result)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IResult> getResults();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Result Organizer SHALL contain at least one [1..*] component, such that Contains exactly one [1..1] Result (templateId: 2.16.840.1.113883.3.88.11.83.15).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IResult addResult();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Result Organizer SHALL contain at least one [1..*] component, such that Contains exactly one [1..1] Result (templateId: 2.16.840.1.113883.3.88.11.83.15).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IResultOrganizer addResult(IResult value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::ResultOrganizer::resultObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::ResultObservation)).oclAsType(domain::ResultObservation)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<IResultObservation> getResultObservations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Result Organizer SHALL contain at least one [1..*] component (CONF-405), such that Contains exactly one [1..1] Result Observation (templateId: 2.16.840.1.113883.10.20.1.31).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IResultObservation addResultObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Result Organizer SHALL contain at least one [1..*] component (CONF-405), such that Contains exactly one [1..1] Result Observation (templateId: 2.16.840.1.113883.10.20.1.31).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IResultOrganizer addResultObservation(IResultObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IResultOrganizer init();
} // IResultOrganizer
