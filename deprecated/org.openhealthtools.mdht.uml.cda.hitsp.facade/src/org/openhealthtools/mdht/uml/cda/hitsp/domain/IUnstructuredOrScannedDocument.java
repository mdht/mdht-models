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
package org.openhealthtools.mdht.uml.cda.hitsp.domain;

import org.openhealthtools.mdht.uml.cda.Authenticator;
import org.openhealthtools.mdht.uml.cda.Component2;
import org.openhealthtools.mdht.uml.cda.Custodian;
import org.openhealthtools.mdht.uml.cda.DocumentationOf;
import org.openhealthtools.mdht.uml.cda.InformationRecipient;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.LegalAuthenticator;
import org.openhealthtools.mdht.uml.cda.RecordTarget;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unstructured Or Scanned Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Used for documents that implement both HL7 Unstructured Documents and HITSP C62 based on IHE Scanned Documents.
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getUnstructuredOrScannedDocument()
 * @generated
 */
public interface IUnstructuredOrScannedDocument extends IUnstructuredDocument {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDT General Header Constraints SHALL contain exactly one [1..1] typeId (CONF-HP-16).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IUnstructuredOrScannedDocument setTypeId(InfrastructureRootTypeId value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDT General Header Constraints SHALL contain exactly one [1..1] id (CONF-HP-17).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IUnstructuredOrScannedDocument setId(II value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDT General Header Constraints SHALL contain exactly one [1..1] code (CONF-HP-21).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IUnstructuredOrScannedDocument setCode(CE value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDT General Header Constraints SHALL contain exactly one [1..1] title (CONF-HP-22).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IUnstructuredOrScannedDocument setTitle(ST value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDT Unstructured Document SHALL contain exactly one [1..1] effectiveTime (CONF-UD-11).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IUnstructuredOrScannedDocument setEffectiveTime(TS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDT Unstructured Document Contains exactly one [1..1] confidentialityCode.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IUnstructuredOrScannedDocument setConfidentialityCode(CE value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDT General Header Constraints SHALL contain exactly one [1..1] languageCode (CONF-HP-24).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IUnstructuredOrScannedDocument setLanguageCode(CS value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Clinical Document Contains at least one [1..*] recordTarget, where its type is Record Target.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IUnstructuredOrScannedDocument addRecordTarget(RecordTarget value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Clinical Document Contains exactly one [1..1] custodian, where its type is Custodian.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IUnstructuredOrScannedDocument setCustodian(Custodian value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Clinical Document Contains exactly one [1..1] component, where its type is Component2.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IUnstructuredOrScannedDocument setComponent(Component2 value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDT General Header Constraints Contains zero or more [0..*] informationRecipient, such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IUnstructuredOrScannedDocument addInformationRecipient(InformationRecipient value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDT General Header Constraints Contains zero or one [0..1] legalAuthenticator, such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IUnstructuredOrScannedDocument setLegalAuthenticator(LegalAuthenticator value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDT General Header Constraints Contains zero or more [0..*] authenticator, such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IUnstructuredOrScannedDocument addAuthenticator(Authenticator value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Scanned Document SHOULD contain at least one [1..*] scanOriginalAuthor, such that Contains exactly one [1..1] Scan Original Author (templateId: 1.3.6.1.4.1.19376.1.2.20.1).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IUnstructuredOrScannedDocument addScanOriginalAuthor(IScanOriginalAuthor value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Scanned Document SHALL contain at least one [1..*] scanningDevice, such that Contains exactly one [1..1] Scanning Device (templateId: 1.3.6.1.4.1.19376.1.2.20.2).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IUnstructuredOrScannedDocument addScanningDevice(IScanningDevice value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Scanned Document SHALL contain exactly one [1..1] scanDataEnterer, such that Contains exactly one [1..1] Scan Data Enterer (templateId: 1.3.6.1.4.1.19376.1.2.20.3).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IUnstructuredOrScannedDocument setScanDataEnterer(IScanDataEnterer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Scanned Document MAY contain zero or one [0..1] documentationOf, such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IUnstructuredOrScannedDocument setDocumentationOf(DocumentationOf value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IUnstructuredOrScannedDocument init();
} // IUnstructuredOrScannedDocument
