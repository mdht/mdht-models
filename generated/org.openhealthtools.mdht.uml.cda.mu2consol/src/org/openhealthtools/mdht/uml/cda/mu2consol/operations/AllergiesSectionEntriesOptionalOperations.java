/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct;

import org.openhealthtools.mdht.uml.cda.mu2consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;

import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Allergies Section Entries Optional</b></em>' model
 * objects. <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.AllergiesSectionEntriesOptional#validateMu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Allergies Section Entries Optional Allergy Problem Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.AllergiesSectionEntriesOptional#getmu2consolAllergyProblemAct() <em>Getmu2consol Allergy Problem Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.AllergiesSectionEntriesOptional#validateAllergiesSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllergiesSectionEntriesOptionalOperations
		extends
		org.openhealthtools.mdht.uml.cda.consol.operations.AllergiesSectionEntriesOptionalOperations {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AllergiesSectionEntriesOptionalOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(AllergiesSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Allergies Section Entries Optional Allergy Problem Act</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateMu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(AllergiesSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MU2CONSOL_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::AllergyProblemAct))";

	/**
	 * The cached OCL invariant for the '{@link #validateMu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(AllergiesSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Allergies Section Entries Optional Allergy Problem Act</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateMu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(AllergiesSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MU2CONSOL_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and
	 * entry.act.oclIsKindOf(consol::AllergyProblemAct))
	 * 
	 * @param allergiesSectionEntriesOptional
	 *            The receiving '
	 *            <em><b>Allergies Section Entries Optional</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateMu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(
			AllergiesSectionEntriesOptional allergiesSectionEntriesOptional,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MU2CONSOL_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.ALLERGIES_SECTION_ENTRIES_OPTIONAL);
			try {
				VALIDATE_MU2CONSOL_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MU2CONSOL_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MU2CONSOL_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergiesSectionEntriesOptional)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.ALLERGIES_SECTION_ENTRIES_OPTIONAL__MU2CONSOL_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "Mu2consolAllergiesSectionEntriesOptionalAllergyProblemAct", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(allergiesSectionEntriesOptional, context) }),
						 new Object [] { allergiesSectionEntriesOptional }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #getmu2consolAllergyProblemAct(AllergiesSectionEntriesOptional)
	 * <em>Getmu2consol Allergy Problem Act</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getmu2consolAllergyProblemAct(AllergiesSectionEntriesOptional)
	 * @generated
	 * @ordered
	 */
	protected static final String GETMU2CONSOL_ALLERGY_PROBLEM_ACT__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::AllergyProblemAct))->asSequence()->any(true).oclAsType(consol::AllergyProblemAct)";

	/**
	 * The cached OCL query for the '
	 * {@link #getmu2consolAllergyProblemAct(AllergiesSectionEntriesOptional)
	 * <em>Getmu2consol Allergy Problem Act</em>}' query operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getmu2consolAllergyProblemAct(AllergiesSectionEntriesOptional)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GETMU2CONSOL_ALLERGY_PROBLEM_ACT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and
	 * act.oclIsKindOf
	 * (consol::AllergyProblemAct))->asSequence()->any(true).oclAsType
	 * (consol::AllergyProblemAct)
	 * 
	 * @param allergiesSectionEntriesOptional
	 *            The receiving '
	 *            <em><b>Allergies Section Entries Optional</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static AllergyProblemAct getmu2consolAllergyProblemAct(
			AllergiesSectionEntriesOptional allergiesSectionEntriesOptional) {
		if (GETMU2CONSOL_ALLERGY_PROBLEM_ACT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.ALLERGIES_SECTION_ENTRIES_OPTIONAL, Mu2consolPackage.Literals.ALLERGIES_SECTION_ENTRIES_OPTIONAL.getEAllOperations().get(63));
			try {
				GETMU2CONSOL_ALLERGY_PROBLEM_ACT__EOCL_QRY = helper.createQuery(GETMU2CONSOL_ALLERGY_PROBLEM_ACT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GETMU2CONSOL_ALLERGY_PROBLEM_ACT__EOCL_QRY);
		return (AllergyProblemAct) query.evaluate(allergiesSectionEntriesOptional);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergiesSectionEntriesOptionalTemplateId(AllergiesSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional Template Id</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateAllergiesSectionEntriesOptionalTemplateId(AllergiesSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.6')";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergiesSectionEntriesOptionalTemplateId(AllergiesSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateAllergiesSectionEntriesOptionalTemplateId(AllergiesSectionEntriesOptional, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root =
	 * '2.16.840.1.113883.10.20.22.2.6')
	 * 
	 * @param allergiesSectionEntriesOptional
	 *            The receiving '
	 *            <em><b>Allergies Section Entries Optional</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateAllergiesSectionEntriesOptionalTemplateId(
			AllergiesSectionEntriesOptional allergiesSectionEntriesOptional,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.ALLERGIES_SECTION_ENTRIES_OPTIONAL);
			try {
				VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergiesSectionEntriesOptional)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.ALLERGIES_SECTION_ENTRIES_OPTIONAL__ALLERGIES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AllergiesSectionEntriesOptionalTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(allergiesSectionEntriesOptional, context) }),
						 new Object [] { allergiesSectionEntriesOptional }));
			}
			 
			return false;
		}
		return true;
	}

} // AllergiesSectionEntriesOptionalOperations