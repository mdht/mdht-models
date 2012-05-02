/*******************************************************************************
 * Copyright (c) 2011, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
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
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IEncounter;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IImmunization;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedication;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareActivityAct;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareActivityEncounter;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareActivityObservation;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareActivityProcedure;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareActivitySubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareActivitySupply;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IProcedure;
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
			InternalEObject oldCDAType = (InternalEObject) cDAType;
			cDAType = (Section) eResolveProxy(oldCDAType);
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
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPlanOfCareSection(),
				IDomainPackage.eINSTANCE.getPlanOfCareSection().getEAllOperations().get(0));
			try {
				GET_TITLE__EOCL_QRY = helper.createQuery(GET_TITLE__EOCL_EXP);
			} catch (ParserException pe) {
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
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPlanOfCareSection(),
				IDomainPackage.eINSTANCE.getPlanOfCareSection().getEAllOperations().get(3));
			try {
				GET_TEXT__EOCL_QRY = helper.createQuery(GET_TEXT__EOCL_EXP);
			} catch (ParserException pe) {
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
	protected static final String GET_PLAN_OF_CARE_ACTIVITY_ACT__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(domain::PlanOfCareActivityAct))->asSequence()->first().oclAsType(domain::PlanOfCareActivityAct)";

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
	public IPlanOfCareActivityAct getPlanOfCareActivityAct() {
		if (GET_PLAN_OF_CARE_ACTIVITY_ACT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPlanOfCareSection(),
				IDomainPackage.eINSTANCE.getPlanOfCareSection().getEAllOperations().get(6));
			try {
				GET_PLAN_OF_CARE_ACTIVITY_ACT__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_ACTIVITY_ACT__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_ACTIVITY_ACT__EOCL_QRY);
		return (IPlanOfCareActivityAct) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareActivityAct withPlanOfCareActivityAct() {
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
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("PlanOfCareActivityAct");
		IPlanOfCareActivityAct value = (IPlanOfCareActivityAct) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Act) eObject);
		this.getCDAType().addAct((org.openhealthtools.mdht.uml.cda.Act) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareSection setPlanOfCareActivityAct(IPlanOfCareActivityAct value) {
		this.getCDAType().addAct((org.openhealthtools.mdht.uml.cda.Act) value);
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
	protected static final String GET_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__EOCL_EXP = "self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(domain::PlanOfCareActivityEncounter))->asSequence()->first().oclAsType(domain::PlanOfCareActivityEncounter)";

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
	public IPlanOfCareActivityEncounter getPlanOfCareActivityEncounter() {
		if (GET_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPlanOfCareSection(),
				IDomainPackage.eINSTANCE.getPlanOfCareSection().getEAllOperations().get(9));
			try {
				GET_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__EOCL_QRY);
		return (IPlanOfCareActivityEncounter) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareActivityEncounter withPlanOfCareActivityEncounter() {
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
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("PlanOfCareActivityEncounter");
		IPlanOfCareActivityEncounter value = (IPlanOfCareActivityEncounter) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Encounter) eObject);
		this.getCDAType().addEncounter((org.openhealthtools.mdht.uml.cda.Encounter) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareSection setPlanOfCareActivityEncounter(IPlanOfCareActivityEncounter value) {
		this.getCDAType().addEncounter((org.openhealthtools.mdht.uml.cda.Encounter) value);
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
	protected static final String GET_PLAN_OF_CARE_ACTIVITY_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::PlanOfCareActivityObservation))->asSequence()->first().oclAsType(domain::PlanOfCareActivityObservation)";

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
	public IPlanOfCareActivityObservation getPlanOfCareActivityObservation() {
		if (GET_PLAN_OF_CARE_ACTIVITY_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPlanOfCareSection(),
				IDomainPackage.eINSTANCE.getPlanOfCareSection().getEAllOperations().get(12));
			try {
				GET_PLAN_OF_CARE_ACTIVITY_OBSERVATION__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_ACTIVITY_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_ACTIVITY_OBSERVATION__EOCL_QRY);
		return (IPlanOfCareActivityObservation) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareActivityObservation withPlanOfCareActivityObservation() {
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
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("PlanOfCareActivityObservation");
		IPlanOfCareActivityObservation value = (IPlanOfCareActivityObservation) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Observation) eObject);
		this.getCDAType().addObservation((org.openhealthtools.mdht.uml.cda.Observation) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareSection setPlanOfCareActivityObservation(IPlanOfCareActivityObservation value) {
		this.getCDAType().addObservation((org.openhealthtools.mdht.uml.cda.Observation) value);
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
	protected static final String GET_PLAN_OF_CARE_ACTIVITY_PROCEDURE__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(domain::PlanOfCareActivityProcedure))->asSequence()->first().oclAsType(domain::PlanOfCareActivityProcedure)";

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
	public IPlanOfCareActivityProcedure getPlanOfCareActivityProcedure() {
		if (GET_PLAN_OF_CARE_ACTIVITY_PROCEDURE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPlanOfCareSection(),
				IDomainPackage.eINSTANCE.getPlanOfCareSection().getEAllOperations().get(15));
			try {
				GET_PLAN_OF_CARE_ACTIVITY_PROCEDURE__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_ACTIVITY_PROCEDURE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_ACTIVITY_PROCEDURE__EOCL_QRY);
		return (IPlanOfCareActivityProcedure) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareActivityProcedure withPlanOfCareActivityProcedure() {
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
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("PlanOfCareActivityProcedure");
		IPlanOfCareActivityProcedure value = (IPlanOfCareActivityProcedure) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Procedure) eObject);
		this.getCDAType().addProcedure((org.openhealthtools.mdht.uml.cda.Procedure) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareSection setPlanOfCareActivityProcedure(IPlanOfCareActivityProcedure value) {
		this.getCDAType().addProcedure((org.openhealthtools.mdht.uml.cda.Procedure) value);
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
	protected static final String GET_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(domain::PlanOfCareActivitySubstanceAdministration))->asSequence()->first().oclAsType(domain::PlanOfCareActivitySubstanceAdministration)";

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
	public IPlanOfCareActivitySubstanceAdministration getPlanOfCareActivitySubstanceAdministration() {
		if (GET_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPlanOfCareSection(),
				IDomainPackage.eINSTANCE.getPlanOfCareSection().getEAllOperations().get(18));
			try {
				GET_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__EOCL_QRY);
		return (IPlanOfCareActivitySubstanceAdministration) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareActivitySubstanceAdministration withPlanOfCareActivitySubstanceAdministration() {
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
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("PlanOfCareActivitySubstanceAdministration");
		IPlanOfCareActivitySubstanceAdministration value = (IPlanOfCareActivitySubstanceAdministration) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.SubstanceAdministration) eObject);
		this.getCDAType().addSubstanceAdministration((org.openhealthtools.mdht.uml.cda.SubstanceAdministration) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareSection setPlanOfCareActivitySubstanceAdministration(
			IPlanOfCareActivitySubstanceAdministration value) {
		this.getCDAType().addSubstanceAdministration((org.openhealthtools.mdht.uml.cda.SubstanceAdministration) value);
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
	protected static final String GET_PLAN_OF_CARE_ACTIVITY_SUPPLY__EOCL_EXP = "self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(domain::PlanOfCareActivitySupply))->asSequence()->first().oclAsType(domain::PlanOfCareActivitySupply)";

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
	public IPlanOfCareActivitySupply getPlanOfCareActivitySupply() {
		if (GET_PLAN_OF_CARE_ACTIVITY_SUPPLY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPlanOfCareSection(),
				IDomainPackage.eINSTANCE.getPlanOfCareSection().getEAllOperations().get(21));
			try {
				GET_PLAN_OF_CARE_ACTIVITY_SUPPLY__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_ACTIVITY_SUPPLY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_ACTIVITY_SUPPLY__EOCL_QRY);
		return (IPlanOfCareActivitySupply) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareActivitySupply withPlanOfCareActivitySupply() {
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
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("PlanOfCareActivitySupply");
		IPlanOfCareActivitySupply value = (IPlanOfCareActivitySupply) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Supply) eObject);
		this.getCDAType().addSupply((org.openhealthtools.mdht.uml.cda.Supply) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareSection setPlanOfCareActivitySupply(IPlanOfCareActivitySupply value) {
		this.getCDAType().addSupply((org.openhealthtools.mdht.uml.cda.Supply) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedication() <em>Get Medication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedication()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(domain::Medication))->asSequence()->first().oclAsType(domain::Medication)";

	/**
	 * The cached OCL query for the '{@link #getMedication() <em>Get Medication</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedication()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedication getMedication() {
		if (GET_MEDICATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPlanOfCareSection(),
				IDomainPackage.eINSTANCE.getPlanOfCareSection().getEAllOperations().get(24));
			try {
				GET_MEDICATION__EOCL_QRY = helper.createQuery(GET_MEDICATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION__EOCL_QRY);
		return (IMedication) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedication withMedication() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("Medication");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("Medication");
		IMedication value = (IMedication) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.SubstanceAdministration) eObject);
		this.getCDAType().addSubstanceAdministration((org.openhealthtools.mdht.uml.cda.SubstanceAdministration) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareSection setMedication(IMedication value) {
		this.getCDAType().addSubstanceAdministration((org.openhealthtools.mdht.uml.cda.SubstanceAdministration) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getImmunization() <em>Get Immunization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunization()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_IMMUNIZATION__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(domain::Immunization))->asSequence()->first().oclAsType(domain::Immunization)";

	/**
	 * The cached OCL query for the '{@link #getImmunization() <em>Get Immunization</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunization()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_IMMUNIZATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IImmunization getImmunization() {
		if (GET_IMMUNIZATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPlanOfCareSection(),
				IDomainPackage.eINSTANCE.getPlanOfCareSection().getEAllOperations().get(27));
			try {
				GET_IMMUNIZATION__EOCL_QRY = helper.createQuery(GET_IMMUNIZATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_IMMUNIZATION__EOCL_QRY);
		return (IImmunization) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IImmunization withImmunization() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("Immunization");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("Immunization");
		IImmunization value = (IImmunization) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.SubstanceAdministration) eObject);
		this.getCDAType().addSubstanceAdministration((org.openhealthtools.mdht.uml.cda.SubstanceAdministration) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareSection setImmunization(IImmunization value) {
		this.getCDAType().addSubstanceAdministration((org.openhealthtools.mdht.uml.cda.SubstanceAdministration) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getEncounter() <em>Get Encounter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ENCOUNTER__EOCL_EXP = "self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(domain::Encounter))->asSequence()->first().oclAsType(domain::Encounter)";

	/**
	 * The cached OCL query for the '{@link #getEncounter() <em>Get Encounter</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ENCOUNTER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEncounter getEncounter() {
		if (GET_ENCOUNTER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPlanOfCareSection(),
				IDomainPackage.eINSTANCE.getPlanOfCareSection().getEAllOperations().get(30));
			try {
				GET_ENCOUNTER__EOCL_QRY = helper.createQuery(GET_ENCOUNTER__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ENCOUNTER__EOCL_QRY);
		return (IEncounter) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEncounter withEncounter() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("Encounter");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("Encounter");
		IEncounter value = (IEncounter) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Encounter) eObject);
		this.getCDAType().addEncounter((org.openhealthtools.mdht.uml.cda.Encounter) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareSection setEncounter(IEncounter value) {
		this.getCDAType().addEncounter((org.openhealthtools.mdht.uml.cda.Encounter) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedure() <em>Get Procedure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedure()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(domain::Procedure))->asSequence()->first().oclAsType(domain::Procedure)";

	/**
	 * The cached OCL query for the '{@link #getProcedure() <em>Get Procedure</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedure()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProcedure getProcedure() {
		if (GET_PROCEDURE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPlanOfCareSection(),
				IDomainPackage.eINSTANCE.getPlanOfCareSection().getEAllOperations().get(33));
			try {
				GET_PROCEDURE__EOCL_QRY = helper.createQuery(GET_PROCEDURE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE__EOCL_QRY);
		return (IProcedure) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProcedure withProcedure() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("Procedure");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("Procedure");
		IProcedure value = (IProcedure) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Procedure) eObject);
		this.getCDAType().addProcedure((org.openhealthtools.mdht.uml.cda.Procedure) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareSection setProcedure(IProcedure value) {
		this.getCDAType().addProcedure((org.openhealthtools.mdht.uml.cda.Procedure) value);
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
				if (resolve) {
					return getCDAType();
				}
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
				setCDAType((Section) newValue);
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
				setCDAType((Section) null);
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
} // PlanOfCareSectionImpl
