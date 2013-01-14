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
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistory;
import org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;
import org.openhealthtools.mdht.uml.cda.ihe.operations.FamilyMedicalHistorySectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Family History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistorySection#validateHITSPFamilyHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Family History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistorySection#validateHITSPFamilyHistorySectionFamilyHistory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Family History Section Family History</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistorySection#getFamilyHistories() <em>Get Family Histories</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FamilyHistorySectionOperations extends FamilyMedicalHistorySectionOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected FamilyHistorySectionOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateHITSPFamilyHistorySectionTemplateId(FamilyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Family History Section Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHITSPFamilyHistorySectionTemplateId(FamilyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HITSP_FAMILY_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.125')";

	/**
	* The cached OCL invariant for the '{@link #validateHITSPFamilyHistorySectionTemplateId(FamilyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Family History Section Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHITSPFamilyHistorySectionTemplateId(FamilyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HITSP_FAMILY_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param familyHistorySection The receiving '<em><b>Family History Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHITSPFamilyHistorySectionTemplateId(FamilyHistorySection familyHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HITSP_FAMILY_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.FAMILY_HISTORY_SECTION);
			try {
				VALIDATE_HITSP_FAMILY_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_FAMILY_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HITSP_FAMILY_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.FAMILY_HISTORY_SECTION__HITSP_FAMILY_HISTORY_SECTION_TEMPLATE_ID,
					HITSPPlugin.INSTANCE.getString("HITSPFamilyHistorySectionTemplateId"),
					new Object[] { familyHistorySection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHITSPFamilyHistorySectionFamilyHistory(FamilyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Family History Section Family History</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHITSPFamilyHistorySectionFamilyHistory(FamilyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HITSP_FAMILY_HISTORY_SECTION_FAMILY_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(hitsp::FamilyHistory))";

	/**
	* The cached OCL invariant for the '{@link #validateHITSPFamilyHistorySectionFamilyHistory(FamilyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Family History Section Family History</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHITSPFamilyHistorySectionFamilyHistory(FamilyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HITSP_FAMILY_HISTORY_SECTION_FAMILY_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param familyHistorySection The receiving '<em><b>Family History Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHITSPFamilyHistorySectionFamilyHistory(FamilyHistorySection familyHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HITSP_FAMILY_HISTORY_SECTION_FAMILY_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.FAMILY_HISTORY_SECTION);
			try {
				VALIDATE_HITSP_FAMILY_HISTORY_SECTION_FAMILY_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_FAMILY_HISTORY_SECTION_FAMILY_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HITSP_FAMILY_HISTORY_SECTION_FAMILY_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.FAMILY_HISTORY_SECTION__HITSP_FAMILY_HISTORY_SECTION_FAMILY_HISTORY,
					HITSPPlugin.INSTANCE.getString("HITSPFamilyHistorySectionFamilyHistory"),
					new Object[] { familyHistorySection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #getFamilyHistories(FamilyHistorySection) <em>Get Family Histories</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getFamilyHistories(FamilyHistorySection)
	* @generated
	* @ordered
	*/
	protected static final String GET_FAMILY_HISTORIES__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(hitsp::FamilyHistory)).oclAsType(hitsp::FamilyHistory)";

	/**
	* The cached OCL query for the '{@link #getFamilyHistories(FamilyHistorySection) <em>Get Family Histories</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getFamilyHistories(FamilyHistorySection)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_FAMILY_HISTORIES__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static EList<FamilyHistory> getFamilyHistories(FamilyHistorySection familyHistorySection) {
		if (GET_FAMILY_HISTORIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				HITSPPackage.Literals.FAMILY_HISTORY_SECTION,
				HITSPPackage.Literals.FAMILY_HISTORY_SECTION.getEAllOperations().get(66));
			try {
				GET_FAMILY_HISTORIES__EOCL_QRY = helper.createQuery(GET_FAMILY_HISTORIES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FAMILY_HISTORIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FamilyHistory> result = (Collection<FamilyHistory>) query.evaluate(familyHistorySection);
		return new BasicEList.UnmodifiableEList<FamilyHistory>(result.size(), result.toArray());
	}

} // FamilyHistorySectionOperations
