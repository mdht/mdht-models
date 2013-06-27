/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.DICOMObjectCatalogSection;
import org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport;
import org.openhealthtools.mdht.uml.cda.consol.FindingsSection;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Diagnostic Imaging Report</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportUseDiagnosticImagingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Use Diagnostic Imaging Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportAllSectionsHaveTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report All Sections Have Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportSectionsHaveText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Sections Have Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportInformant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportParticipant1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Participant1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportInFulfillmentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report In Fulfillment Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportRelatedDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Related Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportFindingsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Findings Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportDICOMObjectCatalogSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report DICOM Object Catalog Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportParticipantAssociatedEntityPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Participant Associated Entity Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportParticipantAssociatedEntityAssociatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Participant Associated Entity Associated Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportParticipantAssociatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Participant Associated Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportDocumentationOfServiceEvent4ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Documentation Of Service Event4 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportDocumentationOfServiceEvent4Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Documentation Of Service Event4 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportDocumentationOfServiceEvent4Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Documentation Of Service Event4 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportDocumentationOfServiceEvent4PhysicianReadingStudyPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Documentation Of Service Event4 Physician Reading Study Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportDocumentationOfServiceEvent3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Documentation Of Service Event3</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of Encompassing Encounter7 Responsible Party Assigned Entity Has Assign Person Or Represented Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of Encompassing Encounter7 Responsible Party Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportComponentOfEncompassingEncounter7EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of Encompassing Encounter7 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportComponentOfEncompassingEncounter7Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of Encompassing Encounter7 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportComponentOfEncompassingEncounter7PhysicianofRecordParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of Encompassing Encounter7 Physicianof Record Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of Encompassing Encounter7 Responsible Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportComponentOfEncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of Encompassing Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#getFindingsSection() <em>Get Findings Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#getDICOMObjectCatalogSection() <em>Get DICOM Object Catalog Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagnosticImagingReportOperations extends GeneralHeaderConstraintsOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected DiagnosticImagingReportOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateDiagnosticImagingReportUseDiagnosticImagingCode(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Use Diagnostic Imaging Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportUseDiagnosticImagingCode(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_USE_DIAGNOSTIC_IMAGING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.code = '18748-4'";

	/**
	* The cached OCL invariant for the '{@link #validateDiagnosticImagingReportUseDiagnosticImagingCode(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Use Diagnostic Imaging Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportUseDiagnosticImagingCode(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DIAGNOSTIC_IMAGING_REPORT_USE_DIAGNOSTIC_IMAGING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDiagnosticImagingReportUseDiagnosticImagingCode(
			DiagnosticImagingReport diagnosticImagingReport, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_USE_DIAGNOSTIC_IMAGING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_USE_DIAGNOSTIC_IMAGING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_USE_DIAGNOSTIC_IMAGING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DIAGNOSTIC_IMAGING_REPORT_USE_DIAGNOSTIC_IMAGING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			diagnosticImagingReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_USE_DIAGNOSTIC_IMAGING_CODE,
					ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportUseDiagnosticImagingCode"),
					new Object[] { diagnosticImagingReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDiagnosticImagingReportAllSectionsHaveTitle(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report All Sections Have Title</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportAllSectionsHaveTitle(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_ALL_SECTIONS_HAVE_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->reject(section : cda::Section | section.templateId->exists(root = '2.16.840.1.113883.10.20.6.1.1'))->forAll(section : cda::Section | not section.title.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateDiagnosticImagingReportAllSectionsHaveTitle(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report All Sections Have Title</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportAllSectionsHaveTitle(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DIAGNOSTIC_IMAGING_REPORT_ALL_SECTIONS_HAVE_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDiagnosticImagingReportAllSectionsHaveTitle(
			DiagnosticImagingReport diagnosticImagingReport, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_ALL_SECTIONS_HAVE_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_ALL_SECTIONS_HAVE_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_ALL_SECTIONS_HAVE_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DIAGNOSTIC_IMAGING_REPORT_ALL_SECTIONS_HAVE_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			diagnosticImagingReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_ALL_SECTIONS_HAVE_TITLE,
					ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportAllSectionsHaveTitle"),
					new Object[] { diagnosticImagingReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDiagnosticImagingReportSectionsHaveText(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Sections Have Text</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportSectionsHaveText(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_SECTIONS_HAVE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->reject(section : cda::Section | section.templateId->exists(root = '2.16.840.1.113883.10.20.6.1.1'))->forAll(section : cda::Section | not section.text.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateDiagnosticImagingReportSectionsHaveText(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Sections Have Text</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportSectionsHaveText(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DIAGNOSTIC_IMAGING_REPORT_SECTIONS_HAVE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDiagnosticImagingReportSectionsHaveText(
			DiagnosticImagingReport diagnosticImagingReport, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_SECTIONS_HAVE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_SECTIONS_HAVE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_SECTIONS_HAVE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_SECTIONS_HAVE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			diagnosticImagingReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_SECTIONS_HAVE_TEXT,
					ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportSectionsHaveText"),
					new Object[] { diagnosticImagingReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDiagnosticImagingReportTemplateId(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportTemplateId(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.5')";

	/**
	* The cached OCL invariant for the '{@link #validateDiagnosticImagingReportTemplateId(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportTemplateId(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DIAGNOSTIC_IMAGING_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDiagnosticImagingReportTemplateId(DiagnosticImagingReport diagnosticImagingReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			diagnosticImagingReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportTemplateId"),
					new Object[] { diagnosticImagingReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDiagnosticImagingReportCodeP(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportCodeP(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateDiagnosticImagingReportCodeP(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportCodeP(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DIAGNOSTIC_IMAGING_REPORT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDiagnosticImagingReportCodeP(DiagnosticImagingReport diagnosticImagingReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			diagnosticImagingReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_CODE_P,
					ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportCodeP"),
					new Object[] { diagnosticImagingReport }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReportCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReportCodeP", passToken);
				}
				passToken.add(diagnosticImagingReport);
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDiagnosticImagingReportCode(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportCode(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = '18748-4' or value.code = '18747-6' or value.code = '18755-9' or value.code = '18760-9' or value.code = '18757-5' or value.code = '18758-3' or value.code = '18745-0' or value.code = '11522-0' or value.code = '18746-8' or value.code = '18751-8' or value.code = '11525-3'))";

	/**
	* The cached OCL invariant for the '{@link #validateDiagnosticImagingReportCode(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportCode(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DIAGNOSTIC_IMAGING_REPORT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDiagnosticImagingReportCode(DiagnosticImagingReport diagnosticImagingReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReportCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(diagnosticImagingReport)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			diagnosticImagingReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_CODE,
					ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportCode"),
					new Object[] { diagnosticImagingReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDiagnosticImagingReportId(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportId(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateDiagnosticImagingReportId(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportId(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DIAGNOSTIC_IMAGING_REPORT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDiagnosticImagingReportId(DiagnosticImagingReport diagnosticImagingReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			diagnosticImagingReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_ID,
					ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportId"),
					new Object[] { diagnosticImagingReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDiagnosticImagingReportInformant(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Informant</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportInformant(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->select(informant : cda::Informant12 | not informant.oclIsUndefined() and informant.oclIsKindOf(rim::Participation))->isEmpty()";

	/**
	* The cached OCL invariant for the '{@link #validateDiagnosticImagingReportInformant(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Informant</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportInformant(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DIAGNOSTIC_IMAGING_REPORT_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDiagnosticImagingReportInformant(DiagnosticImagingReport diagnosticImagingReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			diagnosticImagingReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_INFORMANT,
					ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportInformant"),
					new Object[] { diagnosticImagingReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDiagnosticImagingReportInformationRecipient(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Information Recipient</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportInformationRecipient(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->exists(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(rim::Participation))";

	/**
	* The cached OCL invariant for the '{@link #validateDiagnosticImagingReportInformationRecipient(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Information Recipient</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportInformationRecipient(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DIAGNOSTIC_IMAGING_REPORT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDiagnosticImagingReportInformationRecipient(
			DiagnosticImagingReport diagnosticImagingReport, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DIAGNOSTIC_IMAGING_REPORT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			diagnosticImagingReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_INFORMATION_RECIPIENT,
					ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportInformationRecipient"),
					new Object[] { diagnosticImagingReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDiagnosticImagingReportParticipant1(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Participant1</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportParticipant1(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))";

	/**
	* The cached OCL invariant for the '{@link #validateDiagnosticImagingReportParticipant1(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Participant1</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportParticipant1(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDiagnosticImagingReportParticipant1(DiagnosticImagingReport diagnosticImagingReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			diagnosticImagingReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT1,
					ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportParticipant1"),
					new Object[] { diagnosticImagingReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDiagnosticImagingReportInFulfillmentOf(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report In Fulfillment Of</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportInFulfillmentOf(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.inFulfillmentOf->one(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(cda::InFulfillmentOf))";

	/**
	* The cached OCL invariant for the '{@link #validateDiagnosticImagingReportInFulfillmentOf(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report In Fulfillment Of</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportInFulfillmentOf(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DIAGNOSTIC_IMAGING_REPORT_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDiagnosticImagingReportInFulfillmentOf(
			DiagnosticImagingReport diagnosticImagingReport, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			diagnosticImagingReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_IN_FULFILLMENT_OF,
					ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportInFulfillmentOf"),
					new Object[] { diagnosticImagingReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDiagnosticImagingReportDocumentationOf(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Documentation Of</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportDocumentationOf(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))";

	/**
	* The cached OCL invariant for the '{@link #validateDiagnosticImagingReportDocumentationOf(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Documentation Of</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportDocumentationOf(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDiagnosticImagingReportDocumentationOf(
			DiagnosticImagingReport diagnosticImagingReport, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			diagnosticImagingReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF,
					ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportDocumentationOf"),
					new Object[] { diagnosticImagingReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDiagnosticImagingReportRelatedDocument(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Related Document</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportRelatedDocument(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.relatedDocument->one(relatedDocument : cda::RelatedDocument | not relatedDocument.oclIsUndefined() and relatedDocument.oclIsKindOf(cda::RelatedDocument))";

	/**
	* The cached OCL invariant for the '{@link #validateDiagnosticImagingReportRelatedDocument(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Related Document</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportRelatedDocument(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DIAGNOSTIC_IMAGING_REPORT_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDiagnosticImagingReportRelatedDocument(
			DiagnosticImagingReport diagnosticImagingReport, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			diagnosticImagingReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_RELATED_DOCUMENT,
					ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportRelatedDocument"),
					new Object[] { diagnosticImagingReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDiagnosticImagingReportComponentOf(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportComponentOf(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))";

	/**
	* The cached OCL invariant for the '{@link #validateDiagnosticImagingReportComponentOf(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportComponentOf(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDiagnosticImagingReportComponentOf(DiagnosticImagingReport diagnosticImagingReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			diagnosticImagingReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF,
					ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportComponentOf"),
					new Object[] { diagnosticImagingReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDiagnosticImagingReportFindingsSection(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Findings Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportFindingsSection(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_FINDINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FindingsSection))";

	/**
	* The cached OCL invariant for the '{@link #validateDiagnosticImagingReportFindingsSection(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Findings Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportFindingsSection(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DIAGNOSTIC_IMAGING_REPORT_FINDINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDiagnosticImagingReportFindingsSection(
			DiagnosticImagingReport diagnosticImagingReport, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_FINDINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_FINDINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_FINDINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_FINDINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			diagnosticImagingReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_FINDINGS_SECTION,
					ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportFindingsSection"),
					new Object[] { diagnosticImagingReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDiagnosticImagingReportDICOMObjectCatalogSection(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report DICOM Object Catalog Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportDICOMObjectCatalogSection(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DICOM_OBJECT_CATALOG_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DICOMObjectCatalogSection))";

	/**
	* The cached OCL invariant for the '{@link #validateDiagnosticImagingReportDICOMObjectCatalogSection(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report DICOM Object Catalog Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportDICOMObjectCatalogSection(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DICOM_OBJECT_CATALOG_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDiagnosticImagingReportDICOMObjectCatalogSection(
			DiagnosticImagingReport diagnosticImagingReport, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DICOM_OBJECT_CATALOG_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DICOM_OBJECT_CATALOG_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DICOM_OBJECT_CATALOG_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DICOM_OBJECT_CATALOG_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			diagnosticImagingReport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_DICOM_OBJECT_CATALOG_SECTION,
					ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportDICOMObjectCatalogSection"),
					new Object[] { diagnosticImagingReport }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDiagnosticImagingReportParticipantAssociatedEntityPersonName(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Participant Associated Entity Person Name</em>}' operation.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportParticipantAssociatedEntityPersonName(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT_ASSOCIATED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null).associatedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))";

	/**
	* The cached OCL invariant for the '{@link #validateDiagnosticImagingReportParticipantAssociatedEntityPersonName(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Participant Associated Entity Person Name</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportParticipantAssociatedEntityPersonName(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT_ASSOCIATED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReportParticipantAssociatedEntityPersonName(
			DiagnosticImagingReport diagnosticImagingReport, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT_ASSOCIATED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT_ASSOCIATED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT_ASSOCIATED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT_ASSOCIATED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(diagnosticImagingReport);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT_ASSOCIATED_ENTITY_PERSON_NAME,
						ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportParticipantAssociatedEntityPersonName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDiagnosticImagingReportParticipantAssociatedEntityAssociatedPerson(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Participant Associated Entity Associated Person</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportParticipantAssociatedEntityAssociatedPerson(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject(associatedPerson->one(associatedPerson : cda::Person | not associatedPerson.oclIsUndefined() and associatedPerson.oclIsKindOf(cda::Person)))";

	/**
	* The cached OCL invariant for the '{@link #validateDiagnosticImagingReportParticipantAssociatedEntityAssociatedPerson(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Participant Associated Entity Associated Person</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportParticipantAssociatedEntityAssociatedPerson(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReportParticipantAssociatedEntityAssociatedPerson(
			DiagnosticImagingReport diagnosticImagingReport, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(diagnosticImagingReport);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON,
						ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportParticipantAssociatedEntityAssociatedPerson"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDiagnosticImagingReportParticipantAssociatedEntity(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Participant Associated Entity</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportParticipantAssociatedEntity(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(associatedEntity->one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(cda::AssociatedEntity)))";

	/**
	* The cached OCL invariant for the '{@link #validateDiagnosticImagingReportParticipantAssociatedEntity(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Participant Associated Entity</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportParticipantAssociatedEntity(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReportParticipantAssociatedEntity(
			DiagnosticImagingReport diagnosticImagingReport, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(diagnosticImagingReport);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT_ASSOCIATED_ENTITY,
						ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportParticipantAssociatedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDiagnosticImagingReportDocumentationOfServiceEvent4ClassCode(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Documentation Of Service Event4 Class Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportDocumentationOfServiceEvent4ClassCode(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT4_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(isDefined('classCode') and classCode=vocab::ActClassRoot::ACT)";

	/**
	* The cached OCL invariant for the '{@link #validateDiagnosticImagingReportDocumentationOfServiceEvent4ClassCode(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Documentation Of Service Event4 Class Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportDocumentationOfServiceEvent4ClassCode(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT4_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReportDocumentationOfServiceEvent4ClassCode(
			DiagnosticImagingReport diagnosticImagingReport, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT4_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT4_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT4_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT4_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(diagnosticImagingReport);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT4_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportDocumentationOfServiceEvent4ClassCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDiagnosticImagingReportDocumentationOfServiceEvent4Code(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Documentation Of Service Event4 Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportDocumentationOfServiceEvent4Code(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT4_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	* The cached OCL invariant for the '{@link #validateDiagnosticImagingReportDocumentationOfServiceEvent4Code(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Documentation Of Service Event4 Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportDocumentationOfServiceEvent4Code(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT4_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReportDocumentationOfServiceEvent4Code(
			DiagnosticImagingReport diagnosticImagingReport, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT4_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT4_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT4_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT4_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(diagnosticImagingReport);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT4_CODE,
						ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportDocumentationOfServiceEvent4Code"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDiagnosticImagingReportDocumentationOfServiceEvent4Id(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Documentation Of Service Event4 Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportDocumentationOfServiceEvent4Id(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateDiagnosticImagingReportDocumentationOfServiceEvent4Id(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Documentation Of Service Event4 Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportDocumentationOfServiceEvent4Id(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReportDocumentationOfServiceEvent4Id(
			DiagnosticImagingReport diagnosticImagingReport, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(diagnosticImagingReport);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT4_ID,
						ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportDocumentationOfServiceEvent4Id"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDiagnosticImagingReportDocumentationOfServiceEvent4PhysicianReadingStudyPerformer(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Documentation Of Service Event4 Physician Reading Study Performer</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportDocumentationOfServiceEvent4PhysicianReadingStudyPerformer(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT4_PHYSICIAN_READING_STUDY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(performer->exists(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(consol::PhysicianReadingStudyPerformer)))";

	/**
	* The cached OCL invariant for the '{@link #validateDiagnosticImagingReportDocumentationOfServiceEvent4PhysicianReadingStudyPerformer(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Documentation Of Service Event4 Physician Reading Study Performer</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportDocumentationOfServiceEvent4PhysicianReadingStudyPerformer(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT4_PHYSICIAN_READING_STUDY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReportDocumentationOfServiceEvent4PhysicianReadingStudyPerformer(
			DiagnosticImagingReport diagnosticImagingReport, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT4_PHYSICIAN_READING_STUDY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT4_PHYSICIAN_READING_STUDY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT4_PHYSICIAN_READING_STUDY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT4_PHYSICIAN_READING_STUDY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(diagnosticImagingReport);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT4_PHYSICIAN_READING_STUDY_PERFORMER,
						ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportDocumentationOfServiceEvent4PhysicianReadingStudyPerformer"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDiagnosticImagingReportDocumentationOfServiceEvent3(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Documentation Of Service Event3</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportDocumentationOfServiceEvent3(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null)->reject(serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(cda::ServiceEvent)))";

	/**
	* The cached OCL invariant for the '{@link #validateDiagnosticImagingReportDocumentationOfServiceEvent3(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Documentation Of Service Event3</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportDocumentationOfServiceEvent3(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT3__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReportDocumentationOfServiceEvent3(
			DiagnosticImagingReport diagnosticImagingReport, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT3__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT3__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT3__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(diagnosticImagingReport);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF_SERVICE_EVENT3,
						ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportDocumentationOfServiceEvent3"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of Encompassing Encounter7 Responsible Party Assigned Entity Has Assign Person Or Represented Organization</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_ASSIGN_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->excluding(null).assignedEntity->excluding(null)->reject(assignedPerson->size() = 1 or representedOrganization->size() = 1)";

	/**
	* The cached OCL invariant for the '{@link #validateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of Encompassing Encounter7 Responsible Party Assigned Entity Has Assign Person Or Represented Organization</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_ASSIGN_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization(
			DiagnosticImagingReport diagnosticImagingReport, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_ASSIGN_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_ASSIGN_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_ASSIGN_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_ASSIGN_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(diagnosticImagingReport);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_ASSIGN_PERSON_OR_REPRESENTED_ORGANIZATION,
						ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntityHasAssignPersonOrRepresentedOrganization"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntity(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of Encompassing Encounter7 Responsible Party Assigned Entity</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntity(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	* The cached OCL invariant for the '{@link #validateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntity(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of Encompassing Encounter7 Responsible Party Assigned Entity</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntity(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntity(
			DiagnosticImagingReport diagnosticImagingReport, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(diagnosticImagingReport);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_RESPONSIBLE_PARTY_ASSIGNED_ENTITY,
						ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportComponentOfEncompassingEncounter7ResponsiblePartyAssignedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDiagnosticImagingReportComponentOfEncompassingEncounter7EffectiveTime(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of Encompassing Encounter7 Effective Time</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportComponentOfEncompassingEncounter7EffectiveTime(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))";

	/**
	* The cached OCL invariant for the '{@link #validateDiagnosticImagingReportComponentOfEncompassingEncounter7EffectiveTime(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of Encompassing Encounter7 Effective Time</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportComponentOfEncompassingEncounter7EffectiveTime(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReportComponentOfEncompassingEncounter7EffectiveTime(
			DiagnosticImagingReport diagnosticImagingReport, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(diagnosticImagingReport);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportComponentOfEncompassingEncounter7EffectiveTime"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDiagnosticImagingReportComponentOfEncompassingEncounter7Id(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of Encompassing Encounter7 Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportComponentOfEncompassingEncounter7Id(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateDiagnosticImagingReportComponentOfEncompassingEncounter7Id(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of Encompassing Encounter7 Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportComponentOfEncompassingEncounter7Id(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReportComponentOfEncompassingEncounter7Id(
			DiagnosticImagingReport diagnosticImagingReport, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(diagnosticImagingReport);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_ID,
						ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportComponentOfEncompassingEncounter7Id"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDiagnosticImagingReportComponentOfEncompassingEncounter7PhysicianofRecordParticipant(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of Encompassing Encounter7 Physicianof Record Participant</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportComponentOfEncompassingEncounter7PhysicianofRecordParticipant(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_PHYSICIANOF_RECORD_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(encounterParticipant->one(encounterParticipant : cda::EncounterParticipant | not encounterParticipant.oclIsUndefined() and encounterParticipant.oclIsKindOf(consol::PhysicianofRecordParticipant)))";

	/**
	* The cached OCL invariant for the '{@link #validateDiagnosticImagingReportComponentOfEncompassingEncounter7PhysicianofRecordParticipant(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of Encompassing Encounter7 Physicianof Record Participant</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportComponentOfEncompassingEncounter7PhysicianofRecordParticipant(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_PHYSICIANOF_RECORD_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReportComponentOfEncompassingEncounter7PhysicianofRecordParticipant(
			DiagnosticImagingReport diagnosticImagingReport, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_PHYSICIANOF_RECORD_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_PHYSICIANOF_RECORD_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_PHYSICIANOF_RECORD_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_PHYSICIANOF_RECORD_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(diagnosticImagingReport);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_PHYSICIANOF_RECORD_PARTICIPANT,
						ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportComponentOfEncompassingEncounter7PhysicianofRecordParticipant"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsibleParty(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of Encompassing Encounter7 Responsible Party</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsibleParty(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(responsibleParty->one(responsibleParty : cda::ResponsibleParty | not responsibleParty.oclIsUndefined() and responsibleParty.oclIsKindOf(cda::ResponsibleParty)))";

	/**
	* The cached OCL invariant for the '{@link #validateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsibleParty(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of Encompassing Encounter7 Responsible Party</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsibleParty(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReportComponentOfEncompassingEncounter7ResponsibleParty(
			DiagnosticImagingReport diagnosticImagingReport, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(diagnosticImagingReport);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER7_RESPONSIBLE_PARTY,
						ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportComponentOfEncompassingEncounter7ResponsibleParty"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDiagnosticImagingReportComponentOfEncompassingEncounter(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of Encompassing Encounter</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportComponentOfEncompassingEncounter(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null)->reject(encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter)))";

	/**
	* The cached OCL invariant for the '{@link #validateDiagnosticImagingReportComponentOfEncompassingEncounter(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of Encompassing Encounter</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDiagnosticImagingReportComponentOfEncompassingEncounter(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateDiagnosticImagingReportComponentOfEncompassingEncounter(
			DiagnosticImagingReport diagnosticImagingReport, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(diagnosticImagingReport);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF_ENCOMPASSING_ENCOUNTER,
						ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportComponentOfEncompassingEncounter"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #getFindingsSection(DiagnosticImagingReport) <em>Get Findings Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getFindingsSection(DiagnosticImagingReport)
	* @generated
	* @ordered
	*/
	protected static final String GET_FINDINGS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FindingsSection))->asSequence()->any(true).oclAsType(consol::FindingsSection)";

	/**
	* The cached OCL query for the '{@link #getFindingsSection(DiagnosticImagingReport) <em>Get Findings Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getFindingsSection(DiagnosticImagingReport)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_FINDINGS_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static FindingsSection getFindingsSection(DiagnosticImagingReport diagnosticImagingReport) {
		if (GET_FINDINGS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT,
				ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT.getEAllOperations().get(321));
			try {
				GET_FINDINGS_SECTION__EOCL_QRY = helper.createQuery(GET_FINDINGS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FINDINGS_SECTION__EOCL_QRY);
		return (FindingsSection) query.evaluate(diagnosticImagingReport);
	}

	/**
	* The cached OCL expression body for the '{@link #getDICOMObjectCatalogSection(DiagnosticImagingReport) <em>Get DICOM Object Catalog Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getDICOMObjectCatalogSection(DiagnosticImagingReport)
	* @generated
	* @ordered
	*/
	protected static final String GET_DICOM_OBJECT_CATALOG_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DICOMObjectCatalogSection))->asSequence()->any(true).oclAsType(consol::DICOMObjectCatalogSection)";

	/**
	* The cached OCL query for the '{@link #getDICOMObjectCatalogSection(DiagnosticImagingReport) <em>Get DICOM Object Catalog Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getDICOMObjectCatalogSection(DiagnosticImagingReport)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_DICOM_OBJECT_CATALOG_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static DICOMObjectCatalogSection getDICOMObjectCatalogSection(DiagnosticImagingReport diagnosticImagingReport) {
		if (GET_DICOM_OBJECT_CATALOG_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT,
				ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT.getEAllOperations().get(322));
			try {
				GET_DICOM_OBJECT_CATALOG_SECTION__EOCL_QRY = helper.createQuery(GET_DICOM_OBJECT_CATALOG_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DICOM_OBJECT_CATALOG_SECTION__EOCL_QRY);
		return (DICOMObjectCatalogSection) query.evaluate(diagnosticImagingReport);
	}

} // DiagnosticImagingReportOperations
