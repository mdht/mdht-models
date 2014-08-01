/*******************************************************************************
 * Copyright (c) 2011, 2012 David A. Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.apitest.domain.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IAgeObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.ICauseOfDeathObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IComment;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IHealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.ISeverity;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IProblem Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.impl.IProblemEntryImpl#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IProblemEntryImpl extends EObjectImpl implements IProblemEntry {
	/**
	 * The cached value of the '{@link #getCDAType() <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCDAType()
	 * @generated
	 * @ordered
	 */
	protected Observation cDAType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IProblemEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.IPROBLEM_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observation getCDAType() {
		if (cDAType != null && cDAType.eIsProxy()) {
			InternalEObject oldCDAType = (InternalEObject) cDAType;
			cDAType = (Observation) eResolveProxy(oldCDAType);
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
	public Observation basicGetCDAType() {
		return cDAType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCDAType(Observation newCDAType) {
		cDAType = newCDAType;
	}

	/**
	 * The cached OCL expression body for the '{@link #getIds() <em>Get Ids</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIds()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_IDS__EOCL_EXP = "self.id.oclAsType(datatypes::II)";

	/**
	 * The cached OCL query for the '{@link #getIds() <em>Get Ids</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIds()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_IDS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<II> getIds() {
		if (GET_IDS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				DomainPackage.Literals.IPROBLEM_ENTRY, DomainPackage.Literals.IPROBLEM_ENTRY.getEAllOperations().get(0));
			try {
				GET_IDS__EOCL_QRY = helper.createQuery(GET_IDS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_IDS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<II> result = (Collection<II>) query.evaluate(this);
		return new BasicEList.UnmodifiableEList<II>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public II addId() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("II");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		II value = (II) eObject;
		this.getCDAType().getIds().add(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProblemEntry addId(II value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemType() <em>Get Problem Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemType()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_TYPE__EOCL_EXP = "self.code.oclAsType(datatypes::CD)";

	/**
	 * The cached OCL query for the '{@link #getProblemType() <em>Get Problem Type</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemType()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_TYPE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CD getProblemType() {
		if (GET_PROBLEM_TYPE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				DomainPackage.Literals.IPROBLEM_ENTRY, DomainPackage.Literals.IPROBLEM_ENTRY.getEAllOperations().get(3));
			try {
				GET_PROBLEM_TYPE__EOCL_QRY = helper.createQuery(GET_PROBLEM_TYPE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_TYPE__EOCL_QRY);
		return (CD) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CD withProblemType() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CD");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		CD value = (CD) eObject;
		this.getCDAType().setCode(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProblemEntry withProblemType(CD value) {
		this.getCDAType().setCode(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemName() <em>Get Problem Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemName()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_NAME__EOCL_EXP = "self.text.oclAsType(datatypes::ED)";

	/**
	 * The cached OCL query for the '{@link #getProblemName() <em>Get Problem Name</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemName()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_NAME__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ED getProblemName() {
		if (GET_PROBLEM_NAME__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				DomainPackage.Literals.IPROBLEM_ENTRY, DomainPackage.Literals.IPROBLEM_ENTRY.getEAllOperations().get(6));
			try {
				GET_PROBLEM_NAME__EOCL_QRY = helper.createQuery(GET_PROBLEM_NAME__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_NAME__EOCL_QRY);
		return (ED) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ED withProblemName() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ED");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		ED value = (ED) eObject;
		this.getCDAType().setText(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProblemEntry withProblemName(ED value) {
		this.getCDAType().setText(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemDate() <em>Get Problem Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemDate()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_DATE__EOCL_EXP = "self.effectiveTime.oclAsType(datatypes::IVL_TS)";

	/**
	 * The cached OCL query for the '{@link #getProblemDate() <em>Get Problem Date</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemDate()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_DATE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVL_TS getProblemDate() {
		if (GET_PROBLEM_DATE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				DomainPackage.Literals.IPROBLEM_ENTRY, DomainPackage.Literals.IPROBLEM_ENTRY.getEAllOperations().get(9));
			try {
				GET_PROBLEM_DATE__EOCL_QRY = helper.createQuery(GET_PROBLEM_DATE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_DATE__EOCL_QRY);
		return (IVL_TS) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVL_TS withProblemDate() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("IVL_TS");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		IVL_TS value = (IVL_TS) eObject;
		this.getCDAType().setEffectiveTime(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProblemEntry withProblemDate(IVL_TS value) {
		this.getCDAType().setEffectiveTime(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemCode() <em>Get Problem Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemCode()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_CODE__EOCL_EXP = "self.value.oclAsType(datatypes::CD)";

	/**
	 * The cached OCL query for the '{@link #getProblemCode() <em>Get Problem Code</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemCode()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_CODE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CD getProblemCode() {
		if (GET_PROBLEM_CODE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				DomainPackage.Literals.IPROBLEM_ENTRY,
				DomainPackage.Literals.IPROBLEM_ENTRY.getEAllOperations().get(12));
			try {
				GET_PROBLEM_CODE__EOCL_QRY = helper.createQuery(GET_PROBLEM_CODE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_CODE__EOCL_QRY);
		return (CD) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CD withProblemCode() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CD");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		CD value = (CD) eObject;
		this.getCDAType().getValues().add(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProblemEntry withProblemCode(CD value) {
		this.getCDAType().getValues().add(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAgeAtOnset() <em>Get Age At Onset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeAtOnset()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_AGE_AT_ONSET__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::IAgeObservation))->asSequence()->first().oclAsType(domain::IAgeObservation)";

	/**
	 * The cached OCL query for the '{@link #getAgeAtOnset() <em>Get Age At Onset</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeAtOnset()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_AGE_AT_ONSET__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAgeObservation getAgeAtOnset() {
		if (GET_AGE_AT_ONSET__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				DomainPackage.Literals.IPROBLEM_ENTRY,
				DomainPackage.Literals.IPROBLEM_ENTRY.getEAllOperations().get(15));
			try {
				GET_AGE_AT_ONSET__EOCL_QRY = helper.createQuery(GET_AGE_AT_ONSET__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_AGE_AT_ONSET__EOCL_QRY);
		return (IAgeObservation) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAgeObservation withAgeAtOnset() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("AgeObservation");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("IAgeObservation");
		IAgeObservation value = (IAgeObservation) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Observation) eObject);
		this.getCDAType().addObservation((org.openhealthtools.mdht.uml.cda.Observation) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProblemEntry withAgeAtOnset(IAgeObservation value) {
		this.getCDAType().addObservation((org.openhealthtools.mdht.uml.cda.Observation) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getSeverity() <em>Get Severity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SEVERITY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::ISeverity))->asSequence()->first().oclAsType(domain::ISeverity)";

	/**
	 * The cached OCL query for the '{@link #getSeverity() <em>Get Severity</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SEVERITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISeverity getSeverity() {
		if (GET_SEVERITY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				DomainPackage.Literals.IPROBLEM_ENTRY,
				DomainPackage.Literals.IPROBLEM_ENTRY.getEAllOperations().get(18));
			try {
				GET_SEVERITY__EOCL_QRY = helper.createQuery(GET_SEVERITY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SEVERITY__EOCL_QRY);
		return (ISeverity) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISeverity withSeverity() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("Severity");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("ISeverity");
		ISeverity value = (ISeverity) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Observation) eObject);
		this.getCDAType().addObservation((org.openhealthtools.mdht.uml.cda.Observation) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProblemEntry withSeverity(ISeverity value) {
		this.getCDAType().addObservation((org.openhealthtools.mdht.uml.cda.Observation) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemStatus() <em>Get Problem Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_STATUS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::IProblemStatusObservation))->asSequence()->first().oclAsType(domain::IProblemStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getProblemStatus() <em>Get Problem Status</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemStatus()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_STATUS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProblemStatusObservation getProblemStatus() {
		if (GET_PROBLEM_STATUS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				DomainPackage.Literals.IPROBLEM_ENTRY,
				DomainPackage.Literals.IPROBLEM_ENTRY.getEAllOperations().get(21));
			try {
				GET_PROBLEM_STATUS__EOCL_QRY = helper.createQuery(GET_PROBLEM_STATUS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_STATUS__EOCL_QRY);
		return (IProblemStatusObservation) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProblemStatusObservation withProblemStatus() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ProblemStatusObservation");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("IProblemStatusObservation");
		IProblemStatusObservation value = (IProblemStatusObservation) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Observation) eObject);
		this.getCDAType().addObservation((org.openhealthtools.mdht.uml.cda.Observation) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProblemEntry withProblemStatus(IProblemStatusObservation value) {
		this.getCDAType().addObservation((org.openhealthtools.mdht.uml.cda.Observation) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getHealthStatusObservation() <em>Get Health Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthStatusObservation()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HEALTH_STATUS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::IHealthStatusObservation))->asSequence()->first().oclAsType(domain::IHealthStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getHealthStatusObservation() <em>Get Health Status Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthStatusObservation()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HEALTH_STATUS_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHealthStatusObservation getHealthStatusObservation() {
		if (GET_HEALTH_STATUS_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				DomainPackage.Literals.IPROBLEM_ENTRY,
				DomainPackage.Literals.IPROBLEM_ENTRY.getEAllOperations().get(24));
			try {
				GET_HEALTH_STATUS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_HEALTH_STATUS_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HEALTH_STATUS_OBSERVATION__EOCL_QRY);
		return (IHealthStatusObservation) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHealthStatusObservation withHealthStatusObservation() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("HealthStatusObservation");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("IHealthStatusObservation");
		IHealthStatusObservation value = (IHealthStatusObservation) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Observation) eObject);
		this.getCDAType().addObservation((org.openhealthtools.mdht.uml.cda.Observation) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProblemEntry withHealthStatusObservation(IHealthStatusObservation value) {
		this.getCDAType().addObservation((org.openhealthtools.mdht.uml.cda.Observation) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getComments() <em>Get Comments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMMENTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(domain::IComment)).oclAsType(domain::IComment)";

	/**
	 * The cached OCL query for the '{@link #getComments() <em>Get Comments</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMMENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IComment> getComments() {
		if (GET_COMMENTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				DomainPackage.Literals.IPROBLEM_ENTRY,
				DomainPackage.Literals.IPROBLEM_ENTRY.getEAllOperations().get(27));
			try {
				GET_COMMENTS__EOCL_QRY = helper.createQuery(GET_COMMENTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COMMENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<IComment> result = (Collection<IComment>) query.evaluate(this);
		return new BasicEList.UnmodifiableEList<IComment>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IComment addComment() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("Comment");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("IComment");
		IComment value = (IComment) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Act) eObject);
		this.getCDAType().addAct((org.openhealthtools.mdht.uml.cda.Act) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProblemEntry addComment(IComment value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #getCauseOfDeath() <em>Get Cause Of Death</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCauseOfDeath()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CAUSE_OF_DEATH__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::ICauseOfDeathObservation))->asSequence()->first().oclAsType(domain::ICauseOfDeathObservation)";

	/**
	 * The cached OCL query for the '{@link #getCauseOfDeath() <em>Get Cause Of Death</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCauseOfDeath()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CAUSE_OF_DEATH__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICauseOfDeathObservation getCauseOfDeath() {
		if (GET_CAUSE_OF_DEATH__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				DomainPackage.Literals.IPROBLEM_ENTRY,
				DomainPackage.Literals.IPROBLEM_ENTRY.getEAllOperations().get(30));
			try {
				GET_CAUSE_OF_DEATH__EOCL_QRY = helper.createQuery(GET_CAUSE_OF_DEATH__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CAUSE_OF_DEATH__EOCL_QRY);
		return (ICauseOfDeathObservation) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICauseOfDeathObservation withCauseOfDeath() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CauseOfDeathObservation");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("ICauseOfDeathObservation");
		ICauseOfDeathObservation value = (ICauseOfDeathObservation) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Observation) eObject);
		this.getCDAType().addObservation((org.openhealthtools.mdht.uml.cda.Observation) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProblemEntry withCauseOfDeath(ICauseOfDeathObservation value) {
		this.getCDAType().addObservation((org.openhealthtools.mdht.uml.cda.Observation) value);
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
			case DomainPackage.IPROBLEM_ENTRY__CDA_TYPE:
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
			case DomainPackage.IPROBLEM_ENTRY__CDA_TYPE:
				setCDAType((Observation) newValue);
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
			case DomainPackage.IPROBLEM_ENTRY__CDA_TYPE:
				setCDAType((Observation) null);
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
			case DomainPackage.IPROBLEM_ENTRY__CDA_TYPE:
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
	public IProblemEntry init() {
		CDAUtil.init(this);
		return this;
	}
} // IProblemEntryImpl
