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
package org.openhealthtools.mdht.uml.cda.apitest.domain;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Component2;
import org.openhealthtools.mdht.uml.cda.Custodian;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.RecordTarget;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IGeneral Header Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IGeneralHeaderConstraints#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage#getIGeneralHeaderConstraints()
 * @generated
 */
public interface IGeneralHeaderConstraints {
	/**
	 * Returns the value of the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDA Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDA Type</em>' reference.
	 * @see #setCDAType(ClinicalDocument)
	 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage#getIGeneralHeaderConstraints_CDAType()
	 * @generated
	 */
	ClinicalDocument getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IGeneralHeaderConstraints#getCDAType <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CDA Type</em>' reference.
	 * @see #getCDAType()
	 * @generated
	 */
	void setCDAType(ClinicalDocument value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::typeId.
	 * self.typeId.oclAsType(cda::InfrastructureRootTypeId)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	InfrastructureRootTypeId getTypeId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Clinical Document Contains exactly one [1..1] typeId, where its data type is InfrastructureRootTypeId.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	InfrastructureRootTypeId withTypeId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Clinical Document Contains exactly one [1..1] typeId, where its data type is InfrastructureRootTypeId.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IGeneralHeaderConstraints withTypeId(InfrastructureRootTypeId value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::id.
	 * self.id.oclAsType(datatypes::II)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	II getId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Clinical Document Contains exactly one [1..1] id, where its data type is II.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	II withId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Clinical Document Contains exactly one [1..1] id, where its data type is II.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IGeneralHeaderConstraints withId(II value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::code.
	 * self.code.oclAsType(datatypes::CE)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CE getCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Clinical Document Contains exactly one [1..1] code, where its data type is CE.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CE withCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Clinical Document Contains exactly one [1..1] code, where its data type is CE.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IGeneralHeaderConstraints withCode(CE value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::languageCode.
	 * self.languageCode.oclAsType(datatypes::CS)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CS getLanguageCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest General Header Constraints Contains zero or one [0..1] languageCode.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CS withLanguageCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest General Header Constraints Contains zero or one [0..1] languageCode.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IGeneralHeaderConstraints withLanguageCode(CS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::setId.
	 * self.setId.oclAsType(datatypes::II)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	II getSetId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest General Header Constraints Contains zero or one [0..1] setId.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	II withSetId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest General Header Constraints Contains zero or one [0..1] setId.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IGeneralHeaderConstraints withSetId(II value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::recordTarget.
	 * self.getRecordTargets()->select(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget)).oclAsType(cda::RecordTarget)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<RecordTarget> getRecordTargets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Clinical Document Contains at least one [1..*] recordTarget, where its type is Record Target.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	RecordTarget addRecordTarget();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Clinical Document Contains at least one [1..*] recordTarget, where its type is Record Target.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IGeneralHeaderConstraints addRecordTarget(RecordTarget value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::author.
	 * self.getAuthors()->select(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author)).oclAsType(cda::Author)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<Author> getAuthors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Clinical Document Contains at least one [1..*] author, where its type is Author.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	Author addAuthor();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Clinical Document Contains at least one [1..*] author, where its type is Author.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IGeneralHeaderConstraints addAuthor(Author value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::custodian.
	 * self.getCustodians()->select(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))->asSequence()->first().oclAsType(cda::Custodian)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	Custodian getCustodian();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Clinical Document Contains exactly one [1..1] custodian, where its type is Custodian.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	Custodian withCustodian();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Clinical Document Contains exactly one [1..1] custodian, where its type is Custodian.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IGeneralHeaderConstraints withCustodian(Custodian value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::component.
	 * self.getComponent2s()->select(component2 : cda::Component2 | not component2.oclIsUndefined() and component2.oclIsKindOf(cda::Component2))->asSequence()->first().oclAsType(cda::Component2)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	Component2 getComponent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Clinical Document Contains exactly one [1..1] component, where its type is Component2.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	Component2 withComponent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Clinical Document Contains exactly one [1..1] component, where its type is Component2.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IGeneralHeaderConstraints withComponent(Component2 value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::title.
	 * self.title.oclAsType(datatypes::ST)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ST getTitle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest General Header Constraints Contains zero or one [0..1] title.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ST withTitle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest General Header Constraints Contains zero or one [0..1] title.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IGeneralHeaderConstraints withTitle(ST value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::effectiveTime.
	 * self.effectiveTime.oclAsType(datatypes::TS)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	TS getEffectiveTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Clinical Document Contains exactly one [1..1] effectiveTime, where its data type is TS.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	TS withEffectiveTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Clinical Document Contains exactly one [1..1] effectiveTime, where its data type is TS.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IGeneralHeaderConstraints withEffectiveTime(TS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::ClinicalDocument::confidentialityCode.
	 * self.confidentialityCode.oclAsType(datatypes::CE)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CE getConfidentialityCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Clinical Document Contains exactly one [1..1] confidentialityCode, where its data type is CE.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CE withConfidentialityCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Clinical Document Contains exactly one [1..1] confidentialityCode, where its data type is CE.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IGeneralHeaderConstraints withConfidentialityCode(CE value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IGeneralHeaderConstraints init();
} // IGeneralHeaderConstraints
