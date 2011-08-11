/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.apitest.domain.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IAgeObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.ICauseOfDeathObservation;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ICause Of Death Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.impl.ICauseOfDeathObservationImpl#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ICauseOfDeathObservationImpl extends IFamilyHistoryObservationImpl implements ICauseOfDeathObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ICauseOfDeathObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.ICAUSE_OF_DEATH_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public Observation basicGetCDAType() {
		return cDAType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCDAType(Observation newCDAType) {
		cDAType = newCDAType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCDAType() {
		return cDAType != null;
	}

	/**
	 * The cached OCL expression body for the '{@link #getTimeOfDeath() <em>Get Time Of Death</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfDeath()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TIME_OF_DEATH__EOCL_EXP = "self.effectiveTime.oclAsType(datatypes::IVL_TS)";

	/**
	 * The cached OCL query for the '{@link #getTimeOfDeath() <em>Get Time Of Death</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfDeath()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TIME_OF_DEATH__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVL_TS getTimeOfDeath() {
		if (GET_TIME_OF_DEATH__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				DomainPackage.Literals.ICAUSE_OF_DEATH_OBSERVATION,
				DomainPackage.Literals.ICAUSE_OF_DEATH_OBSERVATION.getEAllOperations().get(9));
			try {
				GET_TIME_OF_DEATH__EOCL_QRY = helper.createQuery(GET_TIME_OF_DEATH__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TIME_OF_DEATH__EOCL_QRY);
		return (IVL_TS) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVL_TS withTimeOfDeath() {
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
	public ICauseOfDeathObservation withTimeOfDeath(IVL_TS value) {
		this.getCDAType().setEffectiveTime(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAgeAtDeath() <em>Get Age At Death</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeAtDeath()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_AGE_AT_DEATH__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::IAgeObservation))->asSequence()->first().oclAsType(domain::IAgeObservation)";

	/**
	 * The cached OCL query for the '{@link #getAgeAtDeath() <em>Get Age At Death</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeAtDeath()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_AGE_AT_DEATH__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAgeObservation getAgeAtDeath() {
		if (GET_AGE_AT_DEATH__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				DomainPackage.Literals.ICAUSE_OF_DEATH_OBSERVATION,
				DomainPackage.Literals.ICAUSE_OF_DEATH_OBSERVATION.getEAllOperations().get(12));
			try {
				GET_AGE_AT_DEATH__EOCL_QRY = helper.createQuery(GET_AGE_AT_DEATH__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_AGE_AT_DEATH__EOCL_QRY);
		return (IAgeObservation) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAgeObservation withAgeAtDeath() {
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
	public ICauseOfDeathObservation withAgeAtDeath(IAgeObservation value) {
		this.getCDAType().addObservation((org.openhealthtools.mdht.uml.cda.Observation) value);
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ICauseOfDeathObservation init() {
		CDAUtil.init(this);
		return this;
	}
} // ICauseOfDeathObservationImpl
