/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.domain.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityAct;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityEncounter;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityObservation;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityProcedure;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivitySubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivitySupply;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan Of Care Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PlanOfCareSectionImpl#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlanOfCareSectionImpl extends EObjectImpl implements IPlanOfCareSection {
	/**
	 * The cached value of the '{@link #getCDAType() <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCDAType()
	 * @generated
	 * @ordered
	 */
	protected Section cDAType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanOfCareSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IDomainPackage.eINSTANCE.getPlanOfCareSection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section getCDAType() {
		if (cDAType != null && cDAType.eIsProxy()) {
			InternalEObject oldCDAType = (InternalEObject)cDAType;
			cDAType = (Section)eResolveProxy(oldCDAType);
			if (cDAType != oldCDAType) {
			}
		}
		return cDAType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section basicGetCDAType() {
		return cDAType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCDAType(Section newCDAType) {
		cDAType = newCDAType;
	}

	/**
	 * The cached OCL expression body for the '{@link #getTitle() <em>Get Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TITLE__EOCL_EXP = "self.title.oclAsType(datatypes::ST)";

	/**
	 * The cached OCL query for the '{@link #getTitle() <em>Get Title</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TITLE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ST getTitle() {
		if (GET_TITLE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getPlanOfCareSection(), IDomainPackage.eINSTANCE.getPlanOfCareSection().getEAllOperations().get(0));
			try {
				GET_TITLE__EOCL_QRY = helper.createQuery(GET_TITLE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TITLE__EOCL_QRY);
		return (ST) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ST withTitle() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ST");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		ST value = (ST) eObject;
		this.getCDAType().setTitle(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareSection setTitle(ST value) {
		this.getCDAType().setTitle(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getText() <em>Get Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TEXT__EOCL_EXP = "self.text.oclAsType(cda::StrucDocText)";

	/**
	 * The cached OCL query for the '{@link #getText() <em>Get Text</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TEXT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrucDocText getText() {
		if (GET_TEXT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getPlanOfCareSection(), IDomainPackage.eINSTANCE.getPlanOfCareSection().getEAllOperations().get(3));
			try {
				GET_TEXT__EOCL_QRY = helper.createQuery(GET_TEXT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TEXT__EOCL_QRY);
		return (StrucDocText) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrucDocText withText() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("StrucDocText");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		StrucDocText value = (StrucDocText) eObject;
		this.getCDAType().setText(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareSection setText(StrucDocText value) {
		this.getCDAType().setText(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanOfCareActivityAct() <em>Get Plan Of Care Activity Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareActivityAct()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_CARE_ACTIVITY_ACT__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ccd::PlanOfCareActivityAct))->asSequence()->first().oclAsType(ccd::PlanOfCareActivityAct)";

	/**
	 * The cached OCL query for the '{@link #getPlanOfCareActivityAct() <em>Get Plan Of Care Activity Act</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareActivityAct()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_ACTIVITY_ACT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivityAct getPlanOfCareActivityAct() {
		if (GET_PLAN_OF_CARE_ACTIVITY_ACT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getPlanOfCareSection(), IDomainPackage.eINSTANCE.getPlanOfCareSection().getEAllOperations().get(6));
			try {
				GET_PLAN_OF_CARE_ACTIVITY_ACT__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_ACTIVITY_ACT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_ACTIVITY_ACT__EOCL_QRY);
		return (PlanOfCareActivityAct) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivityAct withPlanOfCareActivityAct() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ccd");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ccd");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("PlanOfCareActivityAct");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		PlanOfCareActivityAct value = (PlanOfCareActivityAct) eObject;
		this.getCDAType().addAct((org.openhealthtools.mdht.uml.cda.Act)eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareSection setPlanOfCareActivityAct(PlanOfCareActivityAct value) {
		this.getCDAType().addAct((org.openhealthtools.mdht.uml.cda.Act)value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanOfCareActivityEncounter() <em>Get Plan Of Care Activity Encounter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareActivityEncounter()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__EOCL_EXP = "self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(ccd::PlanOfCareActivityEncounter))->asSequence()->first().oclAsType(ccd::PlanOfCareActivityEncounter)";

	/**
	 * The cached OCL query for the '{@link #getPlanOfCareActivityEncounter() <em>Get Plan Of Care Activity Encounter</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareActivityEncounter()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivityEncounter getPlanOfCareActivityEncounter() {
		if (GET_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getPlanOfCareSection(), IDomainPackage.eINSTANCE.getPlanOfCareSection().getEAllOperations().get(9));
			try {
				GET_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__EOCL_QRY);
		return (PlanOfCareActivityEncounter) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivityEncounter withPlanOfCareActivityEncounter() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ccd");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ccd");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("PlanOfCareActivityEncounter");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		PlanOfCareActivityEncounter value = (PlanOfCareActivityEncounter) eObject;
		this.getCDAType().addEncounter((org.openhealthtools.mdht.uml.cda.Encounter)eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareSection setPlanOfCareActivityEncounter(PlanOfCareActivityEncounter value) {
		this.getCDAType().addEncounter((org.openhealthtools.mdht.uml.cda.Encounter)value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanOfCareActivityObservation() <em>Get Plan Of Care Activity Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareActivityObservation()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_CARE_ACTIVITY_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::PlanOfCareActivityObservation))->asSequence()->first().oclAsType(ccd::PlanOfCareActivityObservation)";

	/**
	 * The cached OCL query for the '{@link #getPlanOfCareActivityObservation() <em>Get Plan Of Care Activity Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareActivityObservation()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_ACTIVITY_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivityObservation getPlanOfCareActivityObservation() {
		if (GET_PLAN_OF_CARE_ACTIVITY_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getPlanOfCareSection(), IDomainPackage.eINSTANCE.getPlanOfCareSection().getEAllOperations().get(12));
			try {
				GET_PLAN_OF_CARE_ACTIVITY_OBSERVATION__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_ACTIVITY_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_ACTIVITY_OBSERVATION__EOCL_QRY);
		return (PlanOfCareActivityObservation) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivityObservation withPlanOfCareActivityObservation() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ccd");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ccd");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("PlanOfCareActivityObservation");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		PlanOfCareActivityObservation value = (PlanOfCareActivityObservation) eObject;
		this.getCDAType().addObservation((org.openhealthtools.mdht.uml.cda.Observation)eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareSection setPlanOfCareActivityObservation(PlanOfCareActivityObservation value) {
		this.getCDAType().addObservation((org.openhealthtools.mdht.uml.cda.Observation)value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanOfCareActivityProcedure() <em>Get Plan Of Care Activity Procedure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareActivityProcedure()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_CARE_ACTIVITY_PROCEDURE__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(ccd::PlanOfCareActivityProcedure))->asSequence()->first().oclAsType(ccd::PlanOfCareActivityProcedure)";

	/**
	 * The cached OCL query for the '{@link #getPlanOfCareActivityProcedure() <em>Get Plan Of Care Activity Procedure</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareActivityProcedure()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_ACTIVITY_PROCEDURE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivityProcedure getPlanOfCareActivityProcedure() {
		if (GET_PLAN_OF_CARE_ACTIVITY_PROCEDURE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getPlanOfCareSection(), IDomainPackage.eINSTANCE.getPlanOfCareSection().getEAllOperations().get(15));
			try {
				GET_PLAN_OF_CARE_ACTIVITY_PROCEDURE__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_ACTIVITY_PROCEDURE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_ACTIVITY_PROCEDURE__EOCL_QRY);
		return (PlanOfCareActivityProcedure) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivityProcedure withPlanOfCareActivityProcedure() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ccd");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ccd");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("PlanOfCareActivityProcedure");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		PlanOfCareActivityProcedure value = (PlanOfCareActivityProcedure) eObject;
		this.getCDAType().addProcedure((org.openhealthtools.mdht.uml.cda.Procedure)eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareSection setPlanOfCareActivityProcedure(PlanOfCareActivityProcedure value) {
		this.getCDAType().addProcedure((org.openhealthtools.mdht.uml.cda.Procedure)value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanOfCareActivitySubstanceAdministration() <em>Get Plan Of Care Activity Substance Administration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareActivitySubstanceAdministration()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(ccd::PlanOfCareActivitySubstanceAdministration))->asSequence()->first().oclAsType(ccd::PlanOfCareActivitySubstanceAdministration)";

	/**
	 * The cached OCL query for the '{@link #getPlanOfCareActivitySubstanceAdministration() <em>Get Plan Of Care Activity Substance Administration</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareActivitySubstanceAdministration()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivitySubstanceAdministration getPlanOfCareActivitySubstanceAdministration() {
		if (GET_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getPlanOfCareSection(), IDomainPackage.eINSTANCE.getPlanOfCareSection().getEAllOperations().get(18));
			try {
				GET_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__EOCL_QRY);
		return (PlanOfCareActivitySubstanceAdministration) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivitySubstanceAdministration withPlanOfCareActivitySubstanceAdministration() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ccd");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ccd");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("PlanOfCareActivitySubstanceAdministration");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		PlanOfCareActivitySubstanceAdministration value = (PlanOfCareActivitySubstanceAdministration) eObject;
		this.getCDAType().addSubstanceAdministration((org.openhealthtools.mdht.uml.cda.SubstanceAdministration)eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareSection setPlanOfCareActivitySubstanceAdministration(PlanOfCareActivitySubstanceAdministration value) {
		this.getCDAType().addSubstanceAdministration((org.openhealthtools.mdht.uml.cda.SubstanceAdministration)value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanOfCareActivitySupply() <em>Get Plan Of Care Activity Supply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareActivitySupply()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_CARE_ACTIVITY_SUPPLY__EOCL_EXP = "self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(ccd::PlanOfCareActivitySupply))->asSequence()->first().oclAsType(ccd::PlanOfCareActivitySupply)";

	/**
	 * The cached OCL query for the '{@link #getPlanOfCareActivitySupply() <em>Get Plan Of Care Activity Supply</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareActivitySupply()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_ACTIVITY_SUPPLY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivitySupply getPlanOfCareActivitySupply() {
		if (GET_PLAN_OF_CARE_ACTIVITY_SUPPLY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getPlanOfCareSection(), IDomainPackage.eINSTANCE.getPlanOfCareSection().getEAllOperations().get(21));
			try {
				GET_PLAN_OF_CARE_ACTIVITY_SUPPLY__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_ACTIVITY_SUPPLY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_ACTIVITY_SUPPLY__EOCL_QRY);
		return (PlanOfCareActivitySupply) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivitySupply withPlanOfCareActivitySupply() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ccd");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ccd");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("PlanOfCareActivitySupply");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		PlanOfCareActivitySupply value = (PlanOfCareActivitySupply) eObject;
		this.getCDAType().addSupply((org.openhealthtools.mdht.uml.cda.Supply)eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareSection setPlanOfCareActivitySupply(PlanOfCareActivitySupply value) {
		this.getCDAType().addSupply((org.openhealthtools.mdht.uml.cda.Supply)value);
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IDomainPackage.PLAN_OF_CARE_SECTION__CDA_TYPE:
				if (resolve) return getCDAType();
				return basicGetCDAType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IDomainPackage.PLAN_OF_CARE_SECTION__CDA_TYPE:
				setCDAType((Section)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IDomainPackage.PLAN_OF_CARE_SECTION__CDA_TYPE:
				setCDAType((Section)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IDomainPackage.PLAN_OF_CARE_SECTION__CDA_TYPE:
				return cDAType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final OCL EOCL_ENV = OCL.newInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareSection init() {
    	CDAUtil.init(this);
    	return this;
	}
} //PlanOfCareSectionImpl
