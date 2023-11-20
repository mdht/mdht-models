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
import org.openhealthtools.mdht.uml.cda.consol.ResultOrganizerV4;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Result Organizer V4</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultOrganizerV4#validateResultOrganizerV4Specimen(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer V4 Specimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultOrganizerV4#validateResultOrganizerV4SpecimenSpecimenRolePlayingEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer V4 Specimen Specimen Role Playing Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultOrganizerV4#validateResultOrganizerV4SpecimenSpecimenRolePlayingEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer V4 Specimen Specimen Role Playing Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultOrganizerV4#validateResultOrganizerV4SpecimenSpecimenRoleSpecimenPlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer V4 Specimen Specimen Role Specimen Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultOrganizerV4#validateResultOrganizerV4SpecimenSpecimenRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer V4 Specimen Specimen Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultOrganizerV4#validateResultOrganizer2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer2 Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultOrganizerV4Operations extends ResultOrganizer2Operations {

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
	protected ResultOrganizerV4Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultOrganizerV4Specimen(ResultOrganizerV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer V4 Specimen</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerV4Specimen(ResultOrganizerV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_ORGANIZER_V4_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.specimen->one(specimen : cda::Specimen | not specimen.oclIsUndefined() and specimen.oclIsKindOf(cda::Specimen))";

	/**
	 * The cached OCL invariant for the '{@link #validateResultOrganizerV4Specimen(ResultOrganizerV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer V4 Specimen</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerV4Specimen(ResultOrganizerV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_RESULT_ORGANIZER_V4_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param resultOrganizerV4 The receiving '<em><b>Result Organizer V4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultOrganizerV4Specimen(ResultOrganizerV4 resultOrganizerV4,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ResultOrganizerV4ResultOrganizerV4Specimen", "INFO");

		if (VALIDATE_RESULT_ORGANIZER_V4_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULT_ORGANIZER_V4);
			try {
				VALIDATE_RESULT_ORGANIZER_V4_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_RESULT_ORGANIZER_V4_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_RESULT_ORGANIZER_V4_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(resultOrganizerV4)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RESULT_ORGANIZER_V4__RESULT_ORGANIZER_V4_SPECIMEN,
						ConsolPlugin.INSTANCE.getString("ResultOrganizerV4ResultOrganizerV4Specimen"),
						new Object[] { resultOrganizerV4 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultOrganizerV4SpecimenSpecimenRolePlayingEntityCode(ResultOrganizerV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer V4 Specimen Specimen Role Playing Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerV4SpecimenSpecimenRolePlayingEntityCode(ResultOrganizerV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_ORGANIZER_V4_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.specimen->excluding(null).specimenRole->excluding(null).specimenPlayingEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = code.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96'))";

	/**
	 * The cached OCL invariant for the '{@link #validateResultOrganizerV4SpecimenSpecimenRolePlayingEntityCode(ResultOrganizerV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer V4 Specimen Specimen Role Playing Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerV4SpecimenSpecimenRolePlayingEntityCode(ResultOrganizerV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_RESULT_ORGANIZER_V4_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param resultOrganizerV4 The receiving '<em><b>Result Organizer V4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateResultOrganizerV4SpecimenSpecimenRolePlayingEntityCode(
			ResultOrganizerV4 resultOrganizerV4, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ResultOrganizerV4ResultOrganizerV4SpecimenSpecimenRolePlayingEntityCode", "ERROR");

		if (VALIDATE_RESULT_ORGANIZER_V4_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULT_ORGANIZER_V4);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_RESULT_ORGANIZER_V4_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RESULT_ORGANIZER_V4_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_RESULT_ORGANIZER_V4_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			resultOrganizerV4);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.RESULT_ORGANIZER_V4__RESULT_ORGANIZER_V4_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE,
							ConsolPlugin.INSTANCE.getString(
								"ResultOrganizerV4ResultOrganizerV4SpecimenSpecimenRolePlayingEntityCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultOrganizerV4SpecimenSpecimenRolePlayingEntityCodeP(ResultOrganizerV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer V4 Specimen Specimen Role Playing Entity Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerV4SpecimenSpecimenRolePlayingEntityCodeP(ResultOrganizerV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_ORGANIZER_V4_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.specimen->excluding(null).specimenRole->excluding(null).specimenPlayingEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateResultOrganizerV4SpecimenSpecimenRolePlayingEntityCodeP(ResultOrganizerV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer V4 Specimen Specimen Role Playing Entity Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerV4SpecimenSpecimenRolePlayingEntityCodeP(ResultOrganizerV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_RESULT_ORGANIZER_V4_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param resultOrganizerV4 The receiving '<em><b>Result Organizer V4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateResultOrganizerV4SpecimenSpecimenRolePlayingEntityCodeP(
			ResultOrganizerV4 resultOrganizerV4, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ResultOrganizerV4ResultOrganizerV4SpecimenSpecimenRolePlayingEntityCodeP", "ERROR");

		if (VALIDATE_RESULT_ORGANIZER_V4_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULT_ORGANIZER_V4);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_RESULT_ORGANIZER_V4_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RESULT_ORGANIZER_V4_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_RESULT_ORGANIZER_V4_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			resultOrganizerV4);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.RESULT_ORGANIZER_V4__RESULT_ORGANIZER_V4_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE_P,
							ConsolPlugin.INSTANCE.getString(
								"ResultOrganizerV4ResultOrganizerV4SpecimenSpecimenRolePlayingEntityCodeP"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultOrganizerV4SpecimenSpecimenRoleSpecimenPlayingEntity(ResultOrganizerV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer V4 Specimen Specimen Role Specimen Playing Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerV4SpecimenSpecimenRoleSpecimenPlayingEntity(ResultOrganizerV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_ORGANIZER_V4_SPECIMEN_SPECIMEN_ROLE_SPECIMEN_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.specimen->excluding(null).specimenRole->excluding(null)->reject(specimenPlayingEntity.oclIsTypeOf(cda::PlayingEntity))";

	/**
	 * The cached OCL invariant for the '{@link #validateResultOrganizerV4SpecimenSpecimenRoleSpecimenPlayingEntity(ResultOrganizerV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer V4 Specimen Specimen Role Specimen Playing Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerV4SpecimenSpecimenRoleSpecimenPlayingEntity(ResultOrganizerV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_RESULT_ORGANIZER_V4_SPECIMEN_SPECIMEN_ROLE_SPECIMEN_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param resultOrganizerV4 The receiving '<em><b>Result Organizer V4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateResultOrganizerV4SpecimenSpecimenRoleSpecimenPlayingEntity(
			ResultOrganizerV4 resultOrganizerV4, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ResultOrganizerV4ResultOrganizerV4SpecimenSpecimenRoleSpecimenPlayingEntity", "ERROR");

		if (VALIDATE_RESULT_ORGANIZER_V4_SPECIMEN_SPECIMEN_ROLE_SPECIMEN_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULT_ORGANIZER_V4);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_RESULT_ORGANIZER_V4_SPECIMEN_SPECIMEN_ROLE_SPECIMEN_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RESULT_ORGANIZER_V4_SPECIMEN_SPECIMEN_ROLE_SPECIMEN_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_RESULT_ORGANIZER_V4_SPECIMEN_SPECIMEN_ROLE_SPECIMEN_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			resultOrganizerV4);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.RESULT_ORGANIZER_V4__RESULT_ORGANIZER_V4_SPECIMEN_SPECIMEN_ROLE_SPECIMEN_PLAYING_ENTITY,
							ConsolPlugin.INSTANCE.getString(
								"ResultOrganizerV4ResultOrganizerV4SpecimenSpecimenRoleSpecimenPlayingEntity"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultOrganizerV4SpecimenSpecimenRole(ResultOrganizerV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer V4 Specimen Specimen Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerV4SpecimenSpecimenRole(ResultOrganizerV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_ORGANIZER_V4_SPECIMEN_SPECIMEN_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.specimen->excluding(null)->reject(specimenRole.oclIsTypeOf(cda::SpecimenRole))";

	/**
	 * The cached OCL invariant for the '{@link #validateResultOrganizerV4SpecimenSpecimenRole(ResultOrganizerV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer V4 Specimen Specimen Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerV4SpecimenSpecimenRole(ResultOrganizerV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_RESULT_ORGANIZER_V4_SPECIMEN_SPECIMEN_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param resultOrganizerV4 The receiving '<em><b>Result Organizer V4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateResultOrganizerV4SpecimenSpecimenRole(ResultOrganizerV4 resultOrganizerV4,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ResultOrganizerV4ResultOrganizerV4SpecimenSpecimenRole", "ERROR");

		if (VALIDATE_RESULT_ORGANIZER_V4_SPECIMEN_SPECIMEN_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULT_ORGANIZER_V4);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_RESULT_ORGANIZER_V4_SPECIMEN_SPECIMEN_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RESULT_ORGANIZER_V4_SPECIMEN_SPECIMEN_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_RESULT_ORGANIZER_V4_SPECIMEN_SPECIMEN_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			resultOrganizerV4);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.RESULT_ORGANIZER_V4__RESULT_ORGANIZER_V4_SPECIMEN_SPECIMEN_ROLE,
							ConsolPlugin.INSTANCE.getString("ResultOrganizerV4ResultOrganizerV4SpecimenSpecimenRole"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultOrganizer2TemplateId(ResultOrganizerV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizer2TemplateId(ResultOrganizerV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_ORGANIZER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.1' and id.extension = '2023-05-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultOrganizer2TemplateId(ResultOrganizerV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizer2TemplateId(ResultOrganizerV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_RESULT_ORGANIZER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param resultOrganizerV4 The receiving '<em><b>Result Organizer V4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultOrganizer2TemplateId(ResultOrganizerV4 resultOrganizerV4,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ResultOrganizerV4ResultOrganizer2TemplateId", "ERROR");

		if (VALIDATE_RESULT_ORGANIZER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULT_ORGANIZER_V4);
			try {
				VALIDATE_RESULT_ORGANIZER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_RESULT_ORGANIZER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_RESULT_ORGANIZER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(resultOrganizerV4)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RESULT_ORGANIZER_V4__RESULT_ORGANIZER2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("ResultOrganizerV4ResultOrganizer2TemplateId"),
						new Object[] { resultOrganizerV4 }));
			}

			return false;
		}
		return true;
	}

} // ResultOrganizerV4Operations
