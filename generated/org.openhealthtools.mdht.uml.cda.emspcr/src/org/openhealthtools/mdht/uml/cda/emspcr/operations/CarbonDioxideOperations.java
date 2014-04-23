/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.CarbonDioxide;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Carbon Dioxide</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CarbonDioxide#validateCarbonDioxideTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Dioxide Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CarbonDioxide#validateCarbonDioxideMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Dioxide Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CarbonDioxide#validateCarbonDioxideCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Dioxide Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CarbonDioxide#validateCarbonDioxideCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Dioxide Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CarbonDioxide#validateCarbonDioxideEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Dioxide Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CarbonDioxide#validateCarbonDioxideValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Dioxide Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CarbonDioxideOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarbonDioxideOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarbonDioxideTemplateId(CarbonDioxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Dioxide Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarbonDioxideTemplateId(CarbonDioxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARBON_DIOXIDE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.168')";

	/**
	 * The cached OCL invariant for the '{@link #validateCarbonDioxideTemplateId(CarbonDioxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Dioxide Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarbonDioxideTemplateId(CarbonDioxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARBON_DIOXIDE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carbonDioxide The receiving '<em><b>Carbon Dioxide</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCarbonDioxideTemplateId(CarbonDioxide carbonDioxide, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CARBON_DIOXIDE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARBON_DIOXIDE);
			try {
				VALIDATE_CARBON_DIOXIDE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARBON_DIOXIDE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARBON_DIOXIDE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			carbonDioxide)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CARBON_DIOXIDE__CARBON_DIOXIDE_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("CarbonDioxideTemplateId"), new Object[] { carbonDioxide }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarbonDioxideMoodCode(CarbonDioxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Dioxide Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarbonDioxideMoodCode(CarbonDioxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARBON_DIOXIDE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateCarbonDioxideMoodCode(CarbonDioxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Dioxide Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarbonDioxideMoodCode(CarbonDioxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARBON_DIOXIDE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carbonDioxide The receiving '<em><b>Carbon Dioxide</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCarbonDioxideMoodCode(CarbonDioxide carbonDioxide, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CARBON_DIOXIDE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARBON_DIOXIDE);
			try {
				VALIDATE_CARBON_DIOXIDE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARBON_DIOXIDE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARBON_DIOXIDE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			carbonDioxide)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CARBON_DIOXIDE__CARBON_DIOXIDE_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("CarbonDioxideMoodCode"), new Object[] { carbonDioxide }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarbonDioxideCodeP(CarbonDioxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Dioxide Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarbonDioxideCodeP(CarbonDioxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARBON_DIOXIDE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCarbonDioxideCodeP(CarbonDioxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Dioxide Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarbonDioxideCodeP(CarbonDioxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARBON_DIOXIDE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carbonDioxide The receiving '<em><b>Carbon Dioxide</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCarbonDioxideCodeP(CarbonDioxide carbonDioxide, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CARBON_DIOXIDE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARBON_DIOXIDE);
			try {
				VALIDATE_CARBON_DIOXIDE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARBON_DIOXIDE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARBON_DIOXIDE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(carbonDioxide)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CARBON_DIOXIDE__CARBON_DIOXIDE_CODE_P,
					EmspcrPlugin.INSTANCE.getString("CarbonDioxideCodeP"), new Object[] { carbonDioxide }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.CarbonDioxideCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.CarbonDioxideCodeP", passToken);
				}
				passToken.add(carbonDioxide);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarbonDioxideCode(CarbonDioxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Dioxide Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarbonDioxideCode(CarbonDioxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARBON_DIOXIDE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '19889-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateCarbonDioxideCode(CarbonDioxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Dioxide Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarbonDioxideCode(CarbonDioxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARBON_DIOXIDE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carbonDioxide The receiving '<em><b>Carbon Dioxide</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCarbonDioxideCode(CarbonDioxide carbonDioxide, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.CarbonDioxideCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(carbonDioxide)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_CARBON_DIOXIDE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARBON_DIOXIDE);
			try {
				VALIDATE_CARBON_DIOXIDE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARBON_DIOXIDE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARBON_DIOXIDE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(carbonDioxide)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CARBON_DIOXIDE__CARBON_DIOXIDE_CODE,
					EmspcrPlugin.INSTANCE.getString("CarbonDioxideCode"), new Object[] { carbonDioxide }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarbonDioxideEffectiveTime(CarbonDioxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Dioxide Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarbonDioxideEffectiveTime(CarbonDioxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARBON_DIOXIDE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCarbonDioxideEffectiveTime(CarbonDioxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Dioxide Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarbonDioxideEffectiveTime(CarbonDioxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARBON_DIOXIDE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carbonDioxide The receiving '<em><b>Carbon Dioxide</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCarbonDioxideEffectiveTime(CarbonDioxide carbonDioxide, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CARBON_DIOXIDE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARBON_DIOXIDE);
			try {
				VALIDATE_CARBON_DIOXIDE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARBON_DIOXIDE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARBON_DIOXIDE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			carbonDioxide)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CARBON_DIOXIDE__CARBON_DIOXIDE_EFFECTIVE_TIME,
					EmspcrPlugin.INSTANCE.getString("CarbonDioxideEffectiveTime"), new Object[] { carbonDioxide }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarbonDioxideValue(CarbonDioxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Dioxide Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarbonDioxideValue(CarbonDioxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARBON_DIOXIDE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::PQ)))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarbonDioxideValue(CarbonDioxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Dioxide Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarbonDioxideValue(CarbonDioxide, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARBON_DIOXIDE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carbonDioxide The receiving '<em><b>Carbon Dioxide</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCarbonDioxideValue(CarbonDioxide carbonDioxide, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CARBON_DIOXIDE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARBON_DIOXIDE);
			try {
				VALIDATE_CARBON_DIOXIDE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARBON_DIOXIDE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARBON_DIOXIDE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(carbonDioxide)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.CARBON_DIOXIDE__CARBON_DIOXIDE_VALUE,
					EmspcrPlugin.INSTANCE.getString("CarbonDioxideValue"), new Object[] { carbonDioxide }));
			}

			return false;
		}
		return true;
	}

} // CarbonDioxideOperations
