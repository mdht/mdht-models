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
import org.openhealthtools.mdht.uml.cda.consol.ResultObservationV4;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Result Observation V4</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservationV4#validateResultObservationV4Specimen(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation V4 Specimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservationV4#validateResultObservationV4SpecimenSpecimenRolePlayingEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation V4 Specimen Specimen Role Playing Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservationV4#validateResultObservationV4SpecimenSpecimenRolePlayingEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation V4 Specimen Specimen Role Playing Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservationV4#validateResultObservationV4SpecimenSpecimenRoleSpecimenPlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation V4 Specimen Specimen Role Specimen Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservationV4#validateResultObservationV4SpecimenSpecimenRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation V4 Specimen Specimen Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservationV4#validateResultObservation2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation2 Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultObservationV4Operations extends ResultObservation2Operations {

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
	protected ResultObservationV4Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultObservationV4Specimen(ResultObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation V4 Specimen</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservationV4Specimen(ResultObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_OBSERVATION_V4_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.specimen->exists(specimen : cda::Specimen | not specimen.oclIsUndefined() and specimen.oclIsKindOf(cda::Specimen))";

	/**
	 * The cached OCL invariant for the '{@link #validateResultObservationV4Specimen(ResultObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation V4 Specimen</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservationV4Specimen(ResultObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_RESULT_OBSERVATION_V4_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param resultObservationV4 The receiving '<em><b>Result Observation V4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultObservationV4Specimen(ResultObservationV4 resultObservationV4,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ResultObservationV4ResultObservationV4Specimen", "INFO");

		if (VALIDATE_RESULT_OBSERVATION_V4_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULT_OBSERVATION_V4);
			try {
				VALIDATE_RESULT_OBSERVATION_V4_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_RESULT_OBSERVATION_V4_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_RESULT_OBSERVATION_V4_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(resultObservationV4)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RESULT_OBSERVATION_V4__RESULT_OBSERVATION_V4_SPECIMEN,
						ConsolPlugin.INSTANCE.getString("ResultObservationV4ResultObservationV4Specimen"),
						new Object[] { resultObservationV4 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultObservationV4SpecimenSpecimenRolePlayingEntityCode(ResultObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation V4 Specimen Specimen Role Playing Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservationV4SpecimenSpecimenRolePlayingEntityCode(ResultObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_OBSERVATION_V4_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.specimen->excluding(null).specimenRole->excluding(null).specimenPlayingEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = code.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96'))";

	/**
	 * The cached OCL invariant for the '{@link #validateResultObservationV4SpecimenSpecimenRolePlayingEntityCode(ResultObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation V4 Specimen Specimen Role Playing Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservationV4SpecimenSpecimenRolePlayingEntityCode(ResultObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_RESULT_OBSERVATION_V4_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param resultObservationV4 The receiving '<em><b>Result Observation V4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateResultObservationV4SpecimenSpecimenRolePlayingEntityCode(
			ResultObservationV4 resultObservationV4, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ResultObservationV4ResultObservationV4SpecimenSpecimenRolePlayingEntityCode", "ERROR");

		if (VALIDATE_RESULT_OBSERVATION_V4_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULT_OBSERVATION_V4);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_RESULT_OBSERVATION_V4_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RESULT_OBSERVATION_V4_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_RESULT_OBSERVATION_V4_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			resultObservationV4);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.RESULT_OBSERVATION_V4__RESULT_OBSERVATION_V4_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE,
							ConsolPlugin.INSTANCE.getString(
								"ResultObservationV4ResultObservationV4SpecimenSpecimenRolePlayingEntityCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultObservationV4SpecimenSpecimenRolePlayingEntityCodeP(ResultObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation V4 Specimen Specimen Role Playing Entity Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservationV4SpecimenSpecimenRolePlayingEntityCodeP(ResultObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_OBSERVATION_V4_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.specimen->excluding(null).specimenRole->excluding(null).specimenPlayingEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateResultObservationV4SpecimenSpecimenRolePlayingEntityCodeP(ResultObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation V4 Specimen Specimen Role Playing Entity Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservationV4SpecimenSpecimenRolePlayingEntityCodeP(ResultObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_RESULT_OBSERVATION_V4_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param resultObservationV4 The receiving '<em><b>Result Observation V4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateResultObservationV4SpecimenSpecimenRolePlayingEntityCodeP(
			ResultObservationV4 resultObservationV4, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ResultObservationV4ResultObservationV4SpecimenSpecimenRolePlayingEntityCodeP", "ERROR");

		if (VALIDATE_RESULT_OBSERVATION_V4_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULT_OBSERVATION_V4);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_RESULT_OBSERVATION_V4_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RESULT_OBSERVATION_V4_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_RESULT_OBSERVATION_V4_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			resultObservationV4);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.RESULT_OBSERVATION_V4__RESULT_OBSERVATION_V4_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE_P,
							ConsolPlugin.INSTANCE.getString(
								"ResultObservationV4ResultObservationV4SpecimenSpecimenRolePlayingEntityCodeP"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultObservationV4SpecimenSpecimenRoleSpecimenPlayingEntity(ResultObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation V4 Specimen Specimen Role Specimen Playing Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservationV4SpecimenSpecimenRoleSpecimenPlayingEntity(ResultObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_OBSERVATION_V4_SPECIMEN_SPECIMEN_ROLE_SPECIMEN_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.specimen->excluding(null).specimenRole->excluding(null)->reject(specimenPlayingEntity->one(specimenPlayingEntity : cda::PlayingEntity | not specimenPlayingEntity.oclIsUndefined() and specimenPlayingEntity.oclIsKindOf(cda::PlayingEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateResultObservationV4SpecimenSpecimenRoleSpecimenPlayingEntity(ResultObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation V4 Specimen Specimen Role Specimen Playing Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservationV4SpecimenSpecimenRoleSpecimenPlayingEntity(ResultObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_RESULT_OBSERVATION_V4_SPECIMEN_SPECIMEN_ROLE_SPECIMEN_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param resultObservationV4 The receiving '<em><b>Result Observation V4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateResultObservationV4SpecimenSpecimenRoleSpecimenPlayingEntity(
			ResultObservationV4 resultObservationV4, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ResultObservationV4ResultObservationV4SpecimenSpecimenRoleSpecimenPlayingEntity", "ERROR");

		if (VALIDATE_RESULT_OBSERVATION_V4_SPECIMEN_SPECIMEN_ROLE_SPECIMEN_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULT_OBSERVATION_V4);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_RESULT_OBSERVATION_V4_SPECIMEN_SPECIMEN_ROLE_SPECIMEN_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RESULT_OBSERVATION_V4_SPECIMEN_SPECIMEN_ROLE_SPECIMEN_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_RESULT_OBSERVATION_V4_SPECIMEN_SPECIMEN_ROLE_SPECIMEN_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			resultObservationV4);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.RESULT_OBSERVATION_V4__RESULT_OBSERVATION_V4_SPECIMEN_SPECIMEN_ROLE_SPECIMEN_PLAYING_ENTITY,
							ConsolPlugin.INSTANCE.getString(
								"ResultObservationV4ResultObservationV4SpecimenSpecimenRoleSpecimenPlayingEntity"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultObservationV4SpecimenSpecimenRole(ResultObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation V4 Specimen Specimen Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservationV4SpecimenSpecimenRole(ResultObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_OBSERVATION_V4_SPECIMEN_SPECIMEN_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.specimen->excluding(null)->reject(specimenRole->one(specimenRole : cda::SpecimenRole | not specimenRole.oclIsUndefined() and specimenRole.oclIsKindOf(cda::SpecimenRole)))";

	/**
	 * The cached OCL invariant for the '{@link #validateResultObservationV4SpecimenSpecimenRole(ResultObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation V4 Specimen Specimen Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservationV4SpecimenSpecimenRole(ResultObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_RESULT_OBSERVATION_V4_SPECIMEN_SPECIMEN_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param resultObservationV4 The receiving '<em><b>Result Observation V4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateResultObservationV4SpecimenSpecimenRole(ResultObservationV4 resultObservationV4,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ResultObservationV4ResultObservationV4SpecimenSpecimenRole", "ERROR");

		if (VALIDATE_RESULT_OBSERVATION_V4_SPECIMEN_SPECIMEN_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULT_OBSERVATION_V4);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_RESULT_OBSERVATION_V4_SPECIMEN_SPECIMEN_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RESULT_OBSERVATION_V4_SPECIMEN_SPECIMEN_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_RESULT_OBSERVATION_V4_SPECIMEN_SPECIMEN_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			resultObservationV4);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.RESULT_OBSERVATION_V4__RESULT_OBSERVATION_V4_SPECIMEN_SPECIMEN_ROLE,
							ConsolPlugin.INSTANCE.getString(
								"ResultObservationV4ResultObservationV4SpecimenSpecimenRole"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultObservation2TemplateId(ResultObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservation2TemplateId(ResultObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.2' and id.extension = '2023-05-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultObservation2TemplateId(ResultObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservation2TemplateId(ResultObservationV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_RESULT_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param resultObservationV4 The receiving '<em><b>Result Observation V4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultObservation2TemplateId(ResultObservationV4 resultObservationV4,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ResultObservationV4ResultObservation2TemplateId", "ERROR");

		if (VALIDATE_RESULT_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULT_OBSERVATION_V4);
			try {
				VALIDATE_RESULT_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_RESULT_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_RESULT_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				resultObservationV4)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RESULT_OBSERVATION_V4__RESULT_OBSERVATION2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("ResultObservationV4ResultObservation2TemplateId"),
						new Object[] { resultObservationV4 }));
			}

			return false;
		}
		return true;
	}

} // ResultObservationV4Operations
