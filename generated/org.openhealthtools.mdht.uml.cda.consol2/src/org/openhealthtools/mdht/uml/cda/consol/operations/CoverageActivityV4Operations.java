/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.CoverageActivityV4;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coverage Activity V4</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivityV4#validateCoverageActivityV4EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity V4 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivityV4#validateCoverageActivityV4IVLTSValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity V4IVLTS Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivityV4#validateCoverageActivity2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity2 Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoverageActivityV4Operations extends CoverageActivity2Operations {

	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageActivityV4Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoverageActivityV4EffectiveTime(CoverageActivityV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity V4 Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivityV4EffectiveTime(CoverageActivityV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_ACTIVITY_V4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCoverageActivityV4EffectiveTime(CoverageActivityV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity V4 Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivityV4EffectiveTime(CoverageActivityV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_COVERAGE_ACTIVITY_V4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param coverageActivityV4 The receiving '<em><b>Coverage Activity V4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCoverageActivityV4EffectiveTime(CoverageActivityV4 coverageActivityV4,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CoverageActivityV4CoverageActivityV4EffectiveTime", "WARNING");

		if (VALIDATE_COVERAGE_ACTIVITY_V4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COVERAGE_ACTIVITY_V4);
			try {
				VALIDATE_COVERAGE_ACTIVITY_V4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_COVERAGE_ACTIVITY_V4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_COVERAGE_ACTIVITY_V4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				coverageActivityV4)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COVERAGE_ACTIVITY_V4__COVERAGE_ACTIVITY_V4_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("CoverageActivityV4CoverageActivityV4EffectiveTime"),
						new Object[] { coverageActivityV4 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoverageActivityV4IVLTSValue(CoverageActivityV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity V4IVLTS Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivityV4IVLTSValue(CoverageActivityV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_ACTIVITY_V4IVLTS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not value.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateCoverageActivityV4IVLTSValue(CoverageActivityV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity V4IVLTS Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivityV4IVLTSValue(CoverageActivityV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_COVERAGE_ACTIVITY_V4IVLTS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param coverageActivityV4 The receiving '<em><b>Coverage Activity V4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCoverageActivityV4IVLTSValue(CoverageActivityV4 coverageActivityV4,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CoverageActivityV4CoverageActivityV4IVLTSValue", "ERROR");

		if (VALIDATE_COVERAGE_ACTIVITY_V4IVLTS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COVERAGE_ACTIVITY_V4);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_COVERAGE_ACTIVITY_V4IVLTS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_COVERAGE_ACTIVITY_V4IVLTS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_COVERAGE_ACTIVITY_V4IVLTS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			coverageActivityV4);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.COVERAGE_ACTIVITY_V4__COVERAGE_ACTIVITY_V4IVLTS_VALUE,
							ConsolPlugin.INSTANCE.getString("CoverageActivityV4CoverageActivityV4IVLTSValue"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoverageActivity2TemplateId(CoverageActivityV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivity2TemplateId(CoverageActivityV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_ACTIVITY2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.60' and id.extension = '2023-05-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateCoverageActivity2TemplateId(CoverageActivityV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivity2TemplateId(CoverageActivityV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_COVERAGE_ACTIVITY2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param coverageActivityV4 The receiving '<em><b>Coverage Activity V4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCoverageActivity2TemplateId(CoverageActivityV4 coverageActivityV4,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CoverageActivityV4CoverageActivity2TemplateId", "ERROR");

		if (VALIDATE_COVERAGE_ACTIVITY2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COVERAGE_ACTIVITY_V4);
			try {
				VALIDATE_COVERAGE_ACTIVITY2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_COVERAGE_ACTIVITY2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_COVERAGE_ACTIVITY2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(coverageActivityV4)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COVERAGE_ACTIVITY_V4__COVERAGE_ACTIVITY2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("CoverageActivityV4CoverageActivity2TemplateId"),
						new Object[] { coverageActivityV4 }));
			}

			return false;
		}
		return true;
	}

} // CoverageActivityV4Operations
