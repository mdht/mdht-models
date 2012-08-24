/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.cdt;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unstructured Document</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.cdt.CDTPackage#getUnstructuredDocument()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='UnstructuredDocumentTemplateId UnstructuredDocumentPatientRoleHasId UnstructuredDocumentAssignedAuthorHasAddr UnstructuredDocumentAssignedAuthorHasTelecom UnstructuredDocumentHasRepresentedCustodianOrganization UnstructuredDocumentHasRepresentedCustodianOrganizationId UnstructuredDocumentHasRepresentedCustodianOrganizationName UnstructuredDocumentHasRepresentedCustodianOrganizationTelecom UnstructuredDocumentHasRepresentedCustodianOrganizationAddr UnstructuredDocumentHasNonXMLBodyText UnstructuredDocumentHasTextReferenceOrRepresentation UnstructuredDocumentHasTextMediaTypeValueSet UnstructuredDocumentEffectiveTime UnstructuredDocumentCustodian' templateId.root='2.16.840.1.113883.10.20.19.1'"
 * @generated
 */
public interface UnstructuredDocument extends GeneralHeaderConstraints {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not recordTarget.patientRole.id->isEmpty()'"
   * @generated
   */
	boolean validateUnstructuredDocumentPatientRoleHasId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not author.assignedAuthor.addr->isEmpty()'"
   * @generated
   */
	boolean validateUnstructuredDocumentAssignedAuthorHasAddr(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not author.assignedAuthor.telecom->isEmpty()'"
   * @generated
   */
	boolean validateUnstructuredDocumentAssignedAuthorHasTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not custodian.assignedCustodian.representedCustodianOrganization.oclIsUndefined()'"
   * @generated
   */
	boolean validateUnstructuredDocumentHasRepresentedCustodianOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not custodian.assignedCustodian.representedCustodianOrganization.id->isEmpty()'"
   * @generated
   */
	boolean validateUnstructuredDocumentHasRepresentedCustodianOrganizationId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not custodian.assignedCustodian.representedCustodianOrganization.name.oclIsUndefined()'"
   * @generated
   */
	boolean validateUnstructuredDocumentHasRepresentedCustodianOrganizationName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not custodian.assignedCustodian.representedCustodianOrganization.telecom.oclIsUndefined()'"
   * @generated
   */
	boolean validateUnstructuredDocumentHasRepresentedCustodianOrganizationTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not custodian.assignedCustodian.representedCustodianOrganization.addr.oclIsUndefined()'"
   * @generated
   */
	boolean validateUnstructuredDocumentHasRepresentedCustodianOrganizationAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.component.nonXMLBody.text.oclIsUndefined()'"
   * @generated
   */
	boolean validateUnstructuredDocumentHasNonXMLBodyText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(not self.component.nonXMLBody.text.reference.oclIsUndefined() and self.component.nonXMLBody.text.reference.isDefined(\'value\')) or (self.component.nonXMLBody.text.representation = datatypes::BinaryDataEncoding::B64 and self.component.nonXMLBody.text.isDefined(\'mediaType\') and self.component.nonXMLBody.text.getText().size() > 0)'"
   * @generated
   */
	boolean validateUnstructuredDocumentHasTextReferenceOrRepresentation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component.nonXMLBody.text.isDefined(\'mediaType\') implies (self.component.nonXMLBody.text.mediaType = \'application/msword\' or self.component.nonXMLBody.text.mediaType = \'application/pdf\' or self.component.nonXMLBody.text.mediaType = \'text/plain\' or self.component.nonXMLBody.text.mediaType = \'text/rtf\' or self.component.nonXMLBody.text.mediaType = \'text/html\' or self.component.nonXMLBody.text.mediaType = \'image/gif\' or self.component.nonXMLBody.text.mediaType = \'image/tiff\' or self.component.nonXMLBody.text.mediaType = \'image/jpeg\' or self.component.nonXMLBody.text.mediaType = \'image/png\')'"
   * @generated
   */
	boolean validateUnstructuredDocumentHasTextMediaTypeValueSet(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())'"
   * @generated
   */
	boolean validateUnstructuredDocumentEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(rim::Participation))'"
   * @generated
   */
	boolean validateUnstructuredDocumentCustodian(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public UnstructuredDocument init();

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnstructuredDocument init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // UnstructuredDocument
