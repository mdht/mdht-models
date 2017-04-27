/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.operations;

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
import org.openhealthtools.mdht.uml.cda.clondata.BodyHeight;
import org.openhealthtools.mdht.uml.cda.clondata.BodySurfaceArea;
import org.openhealthtools.mdht.uml.cda.clondata.BodyWeight;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.VitalSignsOrganizerBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;
import org.openhealthtools.mdht.uml.cda.consol.operations.VitalSignsOrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vital Signs Organizer BCTPS</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.VitalSignsOrganizerBCTPS#validateVitalSignsOrganizerBCTPSBodyHeight(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer BCTPS Body Height</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.VitalSignsOrganizerBCTPS#validateVitalSignsOrganizerBCTPSBodyWeight(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer BCTPS Body Weight</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.VitalSignsOrganizerBCTPS#validateVitalSignsOrganizerBCTPSBodySurfaceArea(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer BCTPS Body Surface Area</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.VitalSignsOrganizerBCTPS#getBodyHeights() <em>Get Body Heights</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.VitalSignsOrganizerBCTPS#getBodyWeights() <em>Get Body Weights</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.VitalSignsOrganizerBCTPS#getBodySurfaceAreas() <em>Get Body Surface Areas</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.VitalSignsOrganizerBCTPS#validateVitalSignsOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VitalSignsOrganizerBCTPSOperations extends VitalSignsOrganizerOperations {
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
	protected VitalSignsOrganizerBCTPSOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignsOrganizerBCTPSBodyHeight(VitalSignsOrganizerBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer BCTPS Body Height</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsOrganizerBCTPSBodyHeight(VitalSignsOrganizerBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGNS_ORGANIZER_BCTPS_BODY_HEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(clondata::BodyHeight))";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignsOrganizerBCTPSBodyHeight(VitalSignsOrganizerBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer BCTPS Body Height</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsOrganizerBCTPSBodyHeight(VitalSignsOrganizerBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_VITAL_SIGNS_ORGANIZER_BCTPS_BODY_HEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsOrganizerBCTPS The receiving '<em><b>Vital Signs Organizer BCTPS</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateVitalSignsOrganizerBCTPSBodyHeight(VitalSignsOrganizerBCTPS vitalSignsOrganizerBCTPS,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_VITAL_SIGNS_ORGANIZER_BCTPS_BODY_HEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getVitalSignsOrganizerBCTPS());
			try {
				VALIDATE_VITAL_SIGNS_ORGANIZER_BCTPS_BODY_HEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_VITAL_SIGNS_ORGANIZER_BCTPS_BODY_HEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_VITAL_SIGNS_ORGANIZER_BCTPS_BODY_HEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				vitalSignsOrganizerBCTPS)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.VITAL_SIGNS_ORGANIZER_BCTPS__VITAL_SIGNS_ORGANIZER_BCTPS_BODY_HEIGHT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"VitalSignsOrganizerBCTPSVitalSignsOrganizerBCTPSBodyHeight",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										vitalSignsOrganizerBCTPS, context) }),
						new Object[] { vitalSignsOrganizerBCTPS }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignsOrganizerBCTPSBodyWeight(VitalSignsOrganizerBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer BCTPS Body Weight</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsOrganizerBCTPSBodyWeight(VitalSignsOrganizerBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGNS_ORGANIZER_BCTPS_BODY_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(clondata::BodyWeight))";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignsOrganizerBCTPSBodyWeight(VitalSignsOrganizerBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer BCTPS Body Weight</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsOrganizerBCTPSBodyWeight(VitalSignsOrganizerBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_VITAL_SIGNS_ORGANIZER_BCTPS_BODY_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsOrganizerBCTPS The receiving '<em><b>Vital Signs Organizer BCTPS</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateVitalSignsOrganizerBCTPSBodyWeight(VitalSignsOrganizerBCTPS vitalSignsOrganizerBCTPS,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_VITAL_SIGNS_ORGANIZER_BCTPS_BODY_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getVitalSignsOrganizerBCTPS());
			try {
				VALIDATE_VITAL_SIGNS_ORGANIZER_BCTPS_BODY_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_VITAL_SIGNS_ORGANIZER_BCTPS_BODY_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_VITAL_SIGNS_ORGANIZER_BCTPS_BODY_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				vitalSignsOrganizerBCTPS)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.VITAL_SIGNS_ORGANIZER_BCTPS__VITAL_SIGNS_ORGANIZER_BCTPS_BODY_WEIGHT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"VitalSignsOrganizerBCTPSVitalSignsOrganizerBCTPSBodyWeight",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										vitalSignsOrganizerBCTPS, context) }),
						new Object[] { vitalSignsOrganizerBCTPS }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignsOrganizerBCTPSBodySurfaceArea(VitalSignsOrganizerBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer BCTPS Body Surface Area</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsOrganizerBCTPSBodySurfaceArea(VitalSignsOrganizerBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGNS_ORGANIZER_BCTPS_BODY_SURFACE_AREA__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(clondata::BodySurfaceArea))";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignsOrganizerBCTPSBodySurfaceArea(VitalSignsOrganizerBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer BCTPS Body Surface Area</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsOrganizerBCTPSBodySurfaceArea(VitalSignsOrganizerBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_VITAL_SIGNS_ORGANIZER_BCTPS_BODY_SURFACE_AREA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsOrganizerBCTPS The receiving '<em><b>Vital Signs Organizer BCTPS</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateVitalSignsOrganizerBCTPSBodySurfaceArea(
			VitalSignsOrganizerBCTPS vitalSignsOrganizerBCTPS, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_VITAL_SIGNS_ORGANIZER_BCTPS_BODY_SURFACE_AREA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getVitalSignsOrganizerBCTPS());
			try {
				VALIDATE_VITAL_SIGNS_ORGANIZER_BCTPS_BODY_SURFACE_AREA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_VITAL_SIGNS_ORGANIZER_BCTPS_BODY_SURFACE_AREA__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_VITAL_SIGNS_ORGANIZER_BCTPS_BODY_SURFACE_AREA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				vitalSignsOrganizerBCTPS)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.VITAL_SIGNS_ORGANIZER_BCTPS__VITAL_SIGNS_ORGANIZER_BCTPS_BODY_SURFACE_AREA,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"VitalSignsOrganizerBCTPSVitalSignsOrganizerBCTPSBodySurfaceArea",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										vitalSignsOrganizerBCTPS, context) }),
						new Object[] { vitalSignsOrganizerBCTPS }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getBodyHeights(VitalSignsOrganizerBCTPS) <em>Get Body Heights</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyHeights(VitalSignsOrganizerBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_BODY_HEIGHTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(clondata::BodyHeight)).oclAsType(clondata::BodyHeight)";

	/**
	 * The cached OCL query for the '{@link #getBodyHeights(VitalSignsOrganizerBCTPS) <em>Get Body Heights</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyHeights(VitalSignsOrganizerBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_BODY_HEIGHTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<BodyHeight> getBodyHeights(VitalSignsOrganizerBCTPS vitalSignsOrganizerBCTPS) {

		if (GET_BODY_HEIGHTS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getVitalSignsOrganizerBCTPS(),
				CLONDATAPackage.eINSTANCE.getVitalSignsOrganizerBCTPS().getEAllOperations().get(66));
			try {
				GET_BODY_HEIGHTS__EOCL_QRY = helper.createQuery(GET_BODY_HEIGHTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_BODY_HEIGHTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<BodyHeight> result = (Collection<BodyHeight>) query.evaluate(vitalSignsOrganizerBCTPS);
		return new BasicEList.UnmodifiableEList<BodyHeight>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getBodyWeights(VitalSignsOrganizerBCTPS) <em>Get Body Weights</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyWeights(VitalSignsOrganizerBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_BODY_WEIGHTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(clondata::BodyWeight)).oclAsType(clondata::BodyWeight)";

	/**
	 * The cached OCL query for the '{@link #getBodyWeights(VitalSignsOrganizerBCTPS) <em>Get Body Weights</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyWeights(VitalSignsOrganizerBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_BODY_WEIGHTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<BodyWeight> getBodyWeights(VitalSignsOrganizerBCTPS vitalSignsOrganizerBCTPS) {

		if (GET_BODY_WEIGHTS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getVitalSignsOrganizerBCTPS(),
				CLONDATAPackage.eINSTANCE.getVitalSignsOrganizerBCTPS().getEAllOperations().get(67));
			try {
				GET_BODY_WEIGHTS__EOCL_QRY = helper.createQuery(GET_BODY_WEIGHTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_BODY_WEIGHTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<BodyWeight> result = (Collection<BodyWeight>) query.evaluate(vitalSignsOrganizerBCTPS);
		return new BasicEList.UnmodifiableEList<BodyWeight>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getBodySurfaceAreas(VitalSignsOrganizerBCTPS) <em>Get Body Surface Areas</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySurfaceAreas(VitalSignsOrganizerBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_BODY_SURFACE_AREAS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(clondata::BodySurfaceArea)).oclAsType(clondata::BodySurfaceArea)";

	/**
	 * The cached OCL query for the '{@link #getBodySurfaceAreas(VitalSignsOrganizerBCTPS) <em>Get Body Surface Areas</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySurfaceAreas(VitalSignsOrganizerBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_BODY_SURFACE_AREAS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<BodySurfaceArea> getBodySurfaceAreas(VitalSignsOrganizerBCTPS vitalSignsOrganizerBCTPS) {

		if (GET_BODY_SURFACE_AREAS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getVitalSignsOrganizerBCTPS(),
				CLONDATAPackage.eINSTANCE.getVitalSignsOrganizerBCTPS().getEAllOperations().get(68));
			try {
				GET_BODY_SURFACE_AREAS__EOCL_QRY = helper.createQuery(GET_BODY_SURFACE_AREAS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_BODY_SURFACE_AREAS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<BodySurfaceArea> result = (Collection<BodySurfaceArea>) query.evaluate(vitalSignsOrganizerBCTPS);
		return new BasicEList.UnmodifiableEList<BodySurfaceArea>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignsOrganizerTemplateId(VitalSignsOrganizerBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsOrganizerTemplateId(VitalSignsOrganizerBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.26')";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignsOrganizerTemplateId(VitalSignsOrganizerBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsOrganizerTemplateId(VitalSignsOrganizerBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsOrganizerBCTPS The receiving '<em><b>Vital Signs Organizer BCTPS</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateVitalSignsOrganizerTemplateId(VitalSignsOrganizerBCTPS vitalSignsOrganizerBCTPS,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getVitalSignsOrganizerBCTPS());
			try {
				VALIDATE_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				vitalSignsOrganizerBCTPS)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.VITAL_SIGNS_ORGANIZER_BCTPS__VITAL_SIGNS_ORGANIZER_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"VitalSignsOrganizerBCTPSVitalSignsOrganizerTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										vitalSignsOrganizerBCTPS, context) }),
						new Object[] { vitalSignsOrganizerBCTPS }));
			}

			return false;
		}
		return true;
	}

} // VitalSignsOrganizerBCTPSOperations
