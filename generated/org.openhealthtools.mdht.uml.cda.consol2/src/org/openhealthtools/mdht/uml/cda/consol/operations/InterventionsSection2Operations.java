/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

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
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants;
import org.openhealthtools.mdht.uml.cda.consol.InterventionAct;
import org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Interventions Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2#validateInterventionsSection2InterventionAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Intervention Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2#validateInterventionsSection2HandoffCommunication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Handoff Communication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2#validateInterventionsSection2PlannedInterventionAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Planned Intervention Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2#getInterventionActs() <em>Get Intervention Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2#getHandoffCommunications() <em>Get Handoff Communications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2#getPlannedInterventionActs() <em>Get Planned Intervention Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2#validateInterventionsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2#validateInterventionsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2#validateInterventionsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterventionsSection2Operations extends InterventionsSectionOperations {
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
	protected InterventionsSection2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionsSection2InterventionAct(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Intervention Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionsSection2InterventionAct(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTIONS_SECTION2_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::InterventionAct))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionsSection2InterventionAct(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Intervention Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionsSection2InterventionAct(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_INTERVENTIONS_SECTION2_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionsSection2 The receiving '<em><b>Interventions Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionsSection2InterventionAct(InterventionsSection2 interventionsSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INTERVENTIONS_SECTION2_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTIONS_SECTION2);
			try {
				VALIDATE_INTERVENTIONS_SECTION2_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_INTERVENTIONS_SECTION2_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_INTERVENTIONS_SECTION2_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				interventionsSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.INTERVENTIONS_SECTION2__INTERVENTIONS_SECTION2_INTERVENTION_ACT,
						ConsolPlugin.INSTANCE.getString("InterventionsSection2InterventionsSection2InterventionAct"),
						new Object[] { interventionsSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionsSection2HandoffCommunication(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Handoff Communication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionsSection2HandoffCommunication(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTIONS_SECTION2_HANDOFF_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::HandoffCommunicationParticipants))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionsSection2HandoffCommunication(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Handoff Communication</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionsSection2HandoffCommunication(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_INTERVENTIONS_SECTION2_HANDOFF_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionsSection2 The receiving '<em><b>Interventions Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionsSection2HandoffCommunication(InterventionsSection2 interventionsSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INTERVENTIONS_SECTION2_HANDOFF_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTIONS_SECTION2);
			try {
				VALIDATE_INTERVENTIONS_SECTION2_HANDOFF_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_INTERVENTIONS_SECTION2_HANDOFF_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_INTERVENTIONS_SECTION2_HANDOFF_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				interventionsSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.INTERVENTIONS_SECTION2__INTERVENTIONS_SECTION2_HANDOFF_COMMUNICATION,
						ConsolPlugin.INSTANCE.getString(
							"InterventionsSection2InterventionsSection2HandoffCommunication"),
						new Object[] { interventionsSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionsSection2PlannedInterventionAct(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Planned Intervention Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionsSection2PlannedInterventionAct(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTIONS_SECTION2_PLANNED_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::PlannedInterventionAct))";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionsSection2PlannedInterventionAct(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Planned Intervention Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionsSection2PlannedInterventionAct(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_INTERVENTIONS_SECTION2_PLANNED_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionsSection2 The receiving '<em><b>Interventions Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionsSection2PlannedInterventionAct(
			InterventionsSection2 interventionsSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INTERVENTIONS_SECTION2_PLANNED_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTIONS_SECTION2);
			try {
				VALIDATE_INTERVENTIONS_SECTION2_PLANNED_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_INTERVENTIONS_SECTION2_PLANNED_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_INTERVENTIONS_SECTION2_PLANNED_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				interventionsSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.INTERVENTIONS_SECTION2__INTERVENTIONS_SECTION2_PLANNED_INTERVENTION_ACT,
						ConsolPlugin.INSTANCE.getString(
							"InterventionsSection2InterventionsSection2PlannedInterventionAct"),
						new Object[] { interventionsSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getInterventionActs(InterventionsSection2) <em>Get Intervention Acts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterventionActs(InterventionsSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INTERVENTION_ACTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::InterventionAct)).oclAsType(consol::InterventionAct)";

	/**
	 * The cached OCL query for the '{@link #getInterventionActs(InterventionsSection2) <em>Get Intervention Acts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterventionActs(InterventionsSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INTERVENTION_ACTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<InterventionAct> getInterventionActs(InterventionsSection2 interventionsSection2) {

		if (GET_INTERVENTION_ACTS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.INTERVENTIONS_SECTION2,
				ConsolPackage.Literals.INTERVENTIONS_SECTION2.getEAllOperations().get(63));
			try {
				GET_INTERVENTION_ACTS__EOCL_QRY = helper.createQuery(GET_INTERVENTION_ACTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_INTERVENTION_ACTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<InterventionAct> result = (Collection<InterventionAct>) query.evaluate(interventionsSection2);
		return new BasicEList.UnmodifiableEList<InterventionAct>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getHandoffCommunications(InterventionsSection2) <em>Get Handoff Communications</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandoffCommunications(InterventionsSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HANDOFF_COMMUNICATIONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::HandoffCommunicationParticipants)).oclAsType(consol::HandoffCommunicationParticipants)";

	/**
	 * The cached OCL query for the '{@link #getHandoffCommunications(InterventionsSection2) <em>Get Handoff Communications</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandoffCommunications(InterventionsSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HANDOFF_COMMUNICATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<HandoffCommunicationParticipants> getHandoffCommunications(
			InterventionsSection2 interventionsSection2) {

		if (GET_HANDOFF_COMMUNICATIONS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.INTERVENTIONS_SECTION2,
				ConsolPackage.Literals.INTERVENTIONS_SECTION2.getEAllOperations().get(64));
			try {
				GET_HANDOFF_COMMUNICATIONS__EOCL_QRY = helper.createQuery(GET_HANDOFF_COMMUNICATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_HANDOFF_COMMUNICATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<HandoffCommunicationParticipants> result = (Collection<HandoffCommunicationParticipants>) query.evaluate(
			interventionsSection2);
		return new BasicEList.UnmodifiableEList<HandoffCommunicationParticipants>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlannedInterventionActs(InterventionsSection2) <em>Get Planned Intervention Acts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedInterventionActs(InterventionsSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLANNED_INTERVENTION_ACTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PlannedInterventionAct)).oclAsType(consol::PlannedInterventionAct)";

	/**
	 * The cached OCL query for the '{@link #getPlannedInterventionActs(InterventionsSection2) <em>Get Planned Intervention Acts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedInterventionActs(InterventionsSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLANNED_INTERVENTION_ACTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PlannedInterventionAct> getPlannedInterventionActs(
			InterventionsSection2 interventionsSection2) {

		if (GET_PLANNED_INTERVENTION_ACTS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.INTERVENTIONS_SECTION2,
				ConsolPackage.Literals.INTERVENTIONS_SECTION2.getEAllOperations().get(65));
			try {
				GET_PLANNED_INTERVENTION_ACTS__EOCL_QRY = helper.createQuery(GET_PLANNED_INTERVENTION_ACTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PLANNED_INTERVENTION_ACTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PlannedInterventionAct> result = (Collection<PlannedInterventionAct>) query.evaluate(
			interventionsSection2);
		return new BasicEList.UnmodifiableEList<PlannedInterventionAct>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionsSectionTemplateId(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionsSectionTemplateId(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.21.2.3' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionsSectionTemplateId(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionsSectionTemplateId(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_INTERVENTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionsSection2 The receiving '<em><b>Interventions Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionsSectionTemplateId(InterventionsSection2 interventionsSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INTERVENTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTIONS_SECTION2);
			try {
				VALIDATE_INTERVENTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_INTERVENTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_INTERVENTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				interventionsSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.INTERVENTIONS_SECTION2__INTERVENTIONS_SECTION_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("InterventionsSection2InterventionsSectionTemplateId"),
						new Object[] { interventionsSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionsSectionCodeP(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionsSectionCodeP(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTIONS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionsSectionCodeP(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionsSectionCodeP(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_INTERVENTIONS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionsSection2 The receiving '<em><b>Interventions Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionsSectionCodeP(InterventionsSection2 interventionsSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INTERVENTIONS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTIONS_SECTION2);
			try {
				VALIDATE_INTERVENTIONS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_INTERVENTIONS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_INTERVENTIONS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(interventionsSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.INTERVENTIONS_SECTION2__INTERVENTIONS_SECTION_CODE_P,
						ConsolPlugin.INSTANCE.getString("InterventionsSection2InterventionsSectionCodeP"),
						new Object[] { interventionsSection2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.InterventionsSectionCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.InterventionsSectionCodeP", passToken);
				}
				passToken.add(interventionsSection2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInterventionsSectionCode(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionsSectionCode(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERVENTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.code = '62387-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateInterventionsSectionCode(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInterventionsSectionCode(InterventionsSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_INTERVENTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param interventionsSection2 The receiving '<em><b>Interventions Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInterventionsSectionCode(InterventionsSection2 interventionsSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.InterventionsSectionCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(interventionsSection2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_INTERVENTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INTERVENTIONS_SECTION2);
			try {
				VALIDATE_INTERVENTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_INTERVENTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_INTERVENTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(interventionsSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.INTERVENTIONS_SECTION2__INTERVENTIONS_SECTION_CODE,
						ConsolPlugin.INSTANCE.getString("InterventionsSection2InterventionsSectionCode"),
						new Object[] { interventionsSection2 }));
			}

			return false;
		}
		return true;
	}

} // InterventionsSection2Operations
