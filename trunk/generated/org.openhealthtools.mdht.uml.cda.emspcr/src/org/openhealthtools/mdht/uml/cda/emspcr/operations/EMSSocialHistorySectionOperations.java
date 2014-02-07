/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.emspcr.DrugUseIndication;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugUseIndication;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Social History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection#validateEMSSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection#validateEMSSocialHistorySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection#validateEMSSocialHistorySectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection#validateEMSSocialHistorySectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection#validateEMSSocialHistorySectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection#validateEMSSocialHistorySectionExistenceOfDrugUseIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Existence Of Drug Use Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection#validateEMSSocialHistorySectionDrugUseIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Drug Use Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection#getExistenceOfDrugUseIndication() <em>Get Existence Of Drug Use Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection#getDrugUseIndication() <em>Get Drug Use Indication</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSSocialHistorySectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSSocialHistorySectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSSocialHistorySectionTemplateId(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSocialHistorySectionTemplateId(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.22')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSSocialHistorySectionTemplateId(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSocialHistorySectionTemplateId(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsSocialHistorySection The receiving '<em><b>EMS Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSSocialHistorySectionTemplateId(EMSSocialHistorySection emsSocialHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsSocialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_SOCIAL_HISTORY_SECTION__EMS_SOCIAL_HISTORY_SECTION_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("EMSSocialHistorySectionTemplateId"),
					new Object[] { emsSocialHistorySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSSocialHistorySectionCode(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSocialHistorySectionCode(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '67843-3' and value.codeSystem = '2.16.840.1.113883.6.1'";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSSocialHistorySectionCode(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSocialHistorySectionCode(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsSocialHistorySection The receiving '<em><b>EMS Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSSocialHistorySectionCode(EMSSocialHistorySection emsSocialHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_EMS_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsSocialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_SOCIAL_HISTORY_SECTION__EMS_SOCIAL_HISTORY_SECTION_CODE,
					EmspcrPlugin.INSTANCE.getString("EMSSocialHistorySectionCode"),
					new Object[] { emsSocialHistorySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSSocialHistorySectionCodeP(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSocialHistorySectionCodeP(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_SOCIAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSSocialHistorySectionCodeP(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSocialHistorySectionCodeP(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_SOCIAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsSocialHistorySection The receiving '<em><b>EMS Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSSocialHistorySectionCodeP(EMSSocialHistorySection emsSocialHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_SOCIAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_EMS_SOCIAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SOCIAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_SOCIAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsSocialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_SOCIAL_HISTORY_SECTION__EMS_SOCIAL_HISTORY_SECTION_CODE_P,
					EmspcrPlugin.INSTANCE.getString("EMSSocialHistorySectionCodeP"),
					new Object[] { emsSocialHistorySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSSocialHistorySectionTitle(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSocialHistorySectionTitle(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Social History')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSSocialHistorySectionTitle(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSocialHistorySectionTitle(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsSocialHistorySection The receiving '<em><b>EMS Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSSocialHistorySectionTitle(EMSSocialHistorySection emsSocialHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsSocialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_SOCIAL_HISTORY_SECTION__EMS_SOCIAL_HISTORY_SECTION_TITLE,
					EmspcrPlugin.INSTANCE.getString("EMSSocialHistorySectionTitle"),
					new Object[] { emsSocialHistorySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSSocialHistorySectionText(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSocialHistorySectionText(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSSocialHistorySectionText(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSocialHistorySectionText(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsSocialHistorySection The receiving '<em><b>EMS Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSSocialHistorySectionText(EMSSocialHistorySection emsSocialHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_SOCIAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsSocialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_SOCIAL_HISTORY_SECTION__EMS_SOCIAL_HISTORY_SECTION_TEXT,
					EmspcrPlugin.INSTANCE.getString("EMSSocialHistorySectionText"),
					new Object[] { emsSocialHistorySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSSocialHistorySectionExistenceOfDrugUseIndication(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Existence Of Drug Use Indication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSocialHistorySectionExistenceOfDrugUseIndication(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_SOCIAL_HISTORY_SECTION_EXISTENCE_OF_DRUG_USE_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::ExistenceOfDrugUseIndication) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSSocialHistorySectionExistenceOfDrugUseIndication(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Existence Of Drug Use Indication</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSocialHistorySectionExistenceOfDrugUseIndication(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_SOCIAL_HISTORY_SECTION_EXISTENCE_OF_DRUG_USE_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsSocialHistorySection The receiving '<em><b>EMS Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSSocialHistorySectionExistenceOfDrugUseIndication(
			EMSSocialHistorySection emsSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_SOCIAL_HISTORY_SECTION_EXISTENCE_OF_DRUG_USE_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_EMS_SOCIAL_HISTORY_SECTION_EXISTENCE_OF_DRUG_USE_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SOCIAL_HISTORY_SECTION_EXISTENCE_OF_DRUG_USE_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMS_SOCIAL_HISTORY_SECTION_EXISTENCE_OF_DRUG_USE_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsSocialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_SOCIAL_HISTORY_SECTION__EMS_SOCIAL_HISTORY_SECTION_EXISTENCE_OF_DRUG_USE_INDICATION,
					EmspcrPlugin.INSTANCE.getString("EMSSocialHistorySectionExistenceOfDrugUseIndication"),
					new Object[] { emsSocialHistorySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSSocialHistorySectionDrugUseIndication(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Drug Use Indication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSocialHistorySectionDrugUseIndication(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_SOCIAL_HISTORY_SECTION_DRUG_USE_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::DrugUseIndication) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSSocialHistorySectionDrugUseIndication(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Social History Section Drug Use Indication</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSocialHistorySectionDrugUseIndication(EMSSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_SOCIAL_HISTORY_SECTION_DRUG_USE_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsSocialHistorySection The receiving '<em><b>EMS Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSSocialHistorySectionDrugUseIndication(
			EMSSocialHistorySection emsSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_SOCIAL_HISTORY_SECTION_DRUG_USE_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_EMS_SOCIAL_HISTORY_SECTION_DRUG_USE_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SOCIAL_HISTORY_SECTION_DRUG_USE_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMS_SOCIAL_HISTORY_SECTION_DRUG_USE_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsSocialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_SOCIAL_HISTORY_SECTION__EMS_SOCIAL_HISTORY_SECTION_DRUG_USE_INDICATION,
					EmspcrPlugin.INSTANCE.getString("EMSSocialHistorySectionDrugUseIndication"),
					new Object[] { emsSocialHistorySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getExistenceOfDrugUseIndication(EMSSocialHistorySection) <em>Get Existence Of Drug Use Indication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistenceOfDrugUseIndication(EMSSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EXISTENCE_OF_DRUG_USE_INDICATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::ExistenceOfDrugUseIndication))->asSequence()->any(true).oclAsType(emspcr::ExistenceOfDrugUseIndication)";

	/**
	 * The cached OCL query for the '{@link #getExistenceOfDrugUseIndication(EMSSocialHistorySection) <em>Get Existence Of Drug Use Indication</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistenceOfDrugUseIndication(EMSSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EXISTENCE_OF_DRUG_USE_INDICATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ExistenceOfDrugUseIndication getExistenceOfDrugUseIndication(
			EMSSocialHistorySection emsSocialHistorySection) {
		if (GET_EXISTENCE_OF_DRUG_USE_INDICATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.EMS_SOCIAL_HISTORY_SECTION,
				EmspcrPackage.Literals.EMS_SOCIAL_HISTORY_SECTION.getEAllOperations().get(62));
			try {
				GET_EXISTENCE_OF_DRUG_USE_INDICATION__EOCL_QRY = helper.createQuery(GET_EXISTENCE_OF_DRUG_USE_INDICATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EXISTENCE_OF_DRUG_USE_INDICATION__EOCL_QRY);
		return (ExistenceOfDrugUseIndication) query.evaluate(emsSocialHistorySection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDrugUseIndication(EMSSocialHistorySection) <em>Get Drug Use Indication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrugUseIndication(EMSSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DRUG_USE_INDICATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::DrugUseIndication))->asSequence()->any(true).oclAsType(emspcr::DrugUseIndication)";

	/**
	 * The cached OCL query for the '{@link #getDrugUseIndication(EMSSocialHistorySection) <em>Get Drug Use Indication</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrugUseIndication(EMSSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DRUG_USE_INDICATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static DrugUseIndication getDrugUseIndication(EMSSocialHistorySection emsSocialHistorySection) {
		if (GET_DRUG_USE_INDICATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.EMS_SOCIAL_HISTORY_SECTION,
				EmspcrPackage.Literals.EMS_SOCIAL_HISTORY_SECTION.getEAllOperations().get(63));
			try {
				GET_DRUG_USE_INDICATION__EOCL_QRY = helper.createQuery(GET_DRUG_USE_INDICATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DRUG_USE_INDICATION__EOCL_QRY);
		return (DrugUseIndication) query.evaluate(emsSocialHistorySection);
	}

} // EMSSocialHistorySectionOperations
