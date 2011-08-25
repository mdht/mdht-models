/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.domain.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.Consumable;
import org.openhealthtools.mdht.uml.cda.Performer2;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IInternalReference;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationOrderInformation;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationSeriesNumberObservation;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationSplitDose;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationType;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IPatientMedicalInstructions;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IProductInstance;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IReactionObservation;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Split Dose</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.MedicationSplitDoseImpl#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationSplitDoseImpl extends MedicationImpl implements IMedicationSplitDose {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationSplitDoseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IDomainPackage.eINSTANCE.getMedicationSplitDose();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceAdministration getCDAType() {
		if (cDAType != null && cDAType.eIsProxy()) {
			InternalEObject oldCDAType = (InternalEObject) cDAType;
			cDAType = (SubstanceAdministration) eResolveProxy(oldCDAType);
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
	public SubstanceAdministration basicGetCDAType() {
		return cDAType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCDAType(SubstanceAdministration newCDAType) {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IMedicationSplitDose setConsumable(Consumable value) {
		this.getCDAType().setConsumable(value);
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IMedicationSplitDose setMedicationSeriesNumberObservation(IMedicationSeriesNumberObservation value) {
		this.getCDAType().addObservation((org.openhealthtools.mdht.uml.cda.Observation) value);
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IMedicationSplitDose setMedicationStatusObservation(IMedicationStatusObservation value) {
		this.getCDAType().addObservation((org.openhealthtools.mdht.uml.cda.Observation) value);
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IMedicationSplitDose addPerformer(Performer2 value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IMedicationSplitDose addReactionObservation(IReactionObservation value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IMedicationSplitDose addProductInstance(IProductInstance value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IMedicationSplitDose addInternalReference(IInternalReference value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IMedicationSplitDose addPatientMedicalInstructions(IPatientMedicalInstructions value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsumable() <em>Get Consumable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumable()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSUMABLE__EOCL_EXP = "self.getConsumables()->select(consumable : cda::Consumable | not consumable.oclIsUndefined() and consumable.oclIsKindOf(cda::Consumable))->asSequence()->first().oclAsType(cda::Consumable)";

	/**
	 * The cached OCL query for the '{@link #getConsumable() <em>Get Consumable</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumable()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSUMABLE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Consumable getConsumable() {
		if (GET_CONSUMABLE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getMedicationSplitDose(),
				IDomainPackage.eINSTANCE.getMedicationSplitDose().getEAllOperations().get(27));
			try {
				GET_CONSUMABLE__EOCL_QRY = helper.createQuery(GET_CONSUMABLE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSUMABLE__EOCL_QRY);
		return (Consumable) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Consumable withConsumable() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("Consumable");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		Consumable value = (Consumable) eObject;
		this.getCDAType().setConsumable(value);
		return value;
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationSeriesNumberObservation() <em>Get Medication Series Number Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationSeriesNumberObservation()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::MedicationSeriesNumberObservation))->asSequence()->first().oclAsType(domain::MedicationSeriesNumberObservation)";

	/**
	 * The cached OCL query for the '{@link #getMedicationSeriesNumberObservation() <em>Get Medication Series Number Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationSeriesNumberObservation()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IMedicationSeriesNumberObservation getMedicationSeriesNumberObservation() {
		if (GET_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getMedicationSplitDose(),
				IDomainPackage.eINSTANCE.getMedicationSplitDose().getEAllOperations().get(30));
			try {
				GET_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_QRY = helper.createQuery(GET_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_QRY);
		return (IMedicationSeriesNumberObservation) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IMedicationSeriesNumberObservation withMedicationSeriesNumberObservation() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ccd");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ccd");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("MedicationSeriesNumberObservation");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("MedicationSeriesNumberObservation");
		IMedicationSeriesNumberObservation value = (IMedicationSeriesNumberObservation) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Observation) eObject);
		this.getCDAType().addObservation((org.openhealthtools.mdht.uml.cda.Observation) eObject);
		return value;
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationStatusObservation() <em>Get Medication Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationStatusObservation()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_STATUS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::MedicationStatusObservation))->asSequence()->first().oclAsType(domain::MedicationStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getMedicationStatusObservation() <em>Get Medication Status Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationStatusObservation()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_STATUS_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IMedicationStatusObservation getMedicationStatusObservation() {
		if (GET_MEDICATION_STATUS_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getMedicationSplitDose(),
				IDomainPackage.eINSTANCE.getMedicationSplitDose().getEAllOperations().get(33));
			try {
				GET_MEDICATION_STATUS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_MEDICATION_STATUS_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_STATUS_OBSERVATION__EOCL_QRY);
		return (IMedicationStatusObservation) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IMedicationStatusObservation withMedicationStatusObservation() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ccd");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ccd");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("MedicationStatusObservation");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("MedicationStatusObservation");
		IMedicationStatusObservation value = (IMedicationStatusObservation) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Observation) eObject);
		this.getCDAType().addObservation((org.openhealthtools.mdht.uml.cda.Observation) eObject);
		return value;
	}

	/**
	 * The cached OCL expression body for the '{@link #getPerformers() <em>Get Performers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformers()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PERFORMERS__EOCL_EXP = "self.getPerformer2s()->select(performer2 : cda::Performer2 | not performer2.oclIsUndefined() and performer2.oclIsKindOf(cda::Performer2)).oclAsType(cda::Performer2)";

	/**
	 * The cached OCL query for the '{@link #getPerformers() <em>Get Performers</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformers()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PERFORMERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Performer2> getPerformers() {
		if (GET_PERFORMERS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getMedicationSplitDose(),
				IDomainPackage.eINSTANCE.getMedicationSplitDose().getEAllOperations().get(36));
			try {
				GET_PERFORMERS__EOCL_QRY = helper.createQuery(GET_PERFORMERS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PERFORMERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Performer2> result = (Collection<Performer2>) query.evaluate(this);
		return new BasicEList.UnmodifiableEList<Performer2>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Performer2 addPerformer() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("Performer2");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		Performer2 value = (Performer2) eObject;
		this.getCDAType().getPerformers().add(value);
		return value;
	}

	/**
	 * The cached OCL expression body for the '{@link #getReactionObservations() <em>Get Reaction Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionObservations()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REACTION_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::ReactionObservation)).oclAsType(domain::ReactionObservation)";

	/**
	 * The cached OCL query for the '{@link #getReactionObservations() <em>Get Reaction Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionObservations()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REACTION_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IReactionObservation> getReactionObservations() {
		if (GET_REACTION_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getMedicationSplitDose(),
				IDomainPackage.eINSTANCE.getMedicationSplitDose().getEAllOperations().get(39));
			try {
				GET_REACTION_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_REACTION_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REACTION_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<IReactionObservation> result = (Collection<IReactionObservation>) query.evaluate(this);
		return new BasicEList.UnmodifiableEList<IReactionObservation>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IReactionObservation addReactionObservation() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ccd");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ccd");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ReactionObservation");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("ReactionObservation");
		IReactionObservation value = (IReactionObservation) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Observation) eObject);
		this.getCDAType().addObservation((org.openhealthtools.mdht.uml.cda.Observation) eObject);
		return value;
	}

	/**
	 * The cached OCL expression body for the '{@link #getProductInstances() <em>Get Product Instances</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductInstances()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PRODUCT_INSTANCES__EOCL_EXP = "self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(domain::ProductInstance)).oclAsType(domain::ProductInstance)";

	/**
	 * The cached OCL query for the '{@link #getProductInstances() <em>Get Product Instances</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductInstances()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PRODUCT_INSTANCES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IProductInstance> getProductInstances() {
		if (GET_PRODUCT_INSTANCES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getMedicationSplitDose(),
				IDomainPackage.eINSTANCE.getMedicationSplitDose().getEAllOperations().get(42));
			try {
				GET_PRODUCT_INSTANCES__EOCL_QRY = helper.createQuery(GET_PRODUCT_INSTANCES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PRODUCT_INSTANCES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<IProductInstance> result = (Collection<IProductInstance>) query.evaluate(this);
		return new BasicEList.UnmodifiableEList<IProductInstance>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IProductInstance addProductInstance() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #getInternalReferences() <em>Get Internal References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalReferences()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INTERNAL_REFERENCES__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(domain::InternalReference)).oclAsType(domain::InternalReference)";

	/**
	 * The cached OCL query for the '{@link #getInternalReferences() <em>Get Internal References</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalReferences()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INTERNAL_REFERENCES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IInternalReference> getInternalReferences() {
		if (GET_INTERNAL_REFERENCES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getMedicationSplitDose(),
				IDomainPackage.eINSTANCE.getMedicationSplitDose().getEAllOperations().get(45));
			try {
				GET_INTERNAL_REFERENCES__EOCL_QRY = helper.createQuery(GET_INTERNAL_REFERENCES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INTERNAL_REFERENCES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<IInternalReference> result = (Collection<IInternalReference>) query.evaluate(this);
		return new BasicEList.UnmodifiableEList<IInternalReference>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IInternalReference addInternalReference() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("InternalReference");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("InternalReference");
		IInternalReference value = (IInternalReference) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Act) eObject);
		this.getCDAType().addAct((org.openhealthtools.mdht.uml.cda.Act) eObject);
		return value;
	}

	/**
	 * The cached OCL expression body for the '{@link #getPatientMedicalInstructions() <em>Get Patient Medical Instructions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientMedicalInstructions()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PATIENT_MEDICAL_INSTRUCTIONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(domain::PatientMedicalInstructions)).oclAsType(domain::PatientMedicalInstructions)";

	/**
	 * The cached OCL query for the '{@link #getPatientMedicalInstructions() <em>Get Patient Medical Instructions</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientMedicalInstructions()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PATIENT_MEDICAL_INSTRUCTIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IPatientMedicalInstructions> getPatientMedicalInstructions() {
		if (GET_PATIENT_MEDICAL_INSTRUCTIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getMedicationSplitDose(),
				IDomainPackage.eINSTANCE.getMedicationSplitDose().getEAllOperations().get(48));
			try {
				GET_PATIENT_MEDICAL_INSTRUCTIONS__EOCL_QRY = helper.createQuery(GET_PATIENT_MEDICAL_INSTRUCTIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PATIENT_MEDICAL_INSTRUCTIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<IPatientMedicalInstructions> result = (Collection<IPatientMedicalInstructions>) query.evaluate(this);
		return new BasicEList.UnmodifiableEList<IPatientMedicalInstructions>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IPatientMedicalInstructions addPatientMedicalInstructions() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("PatientMedicalInstructions");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("PatientMedicalInstructions");
		IPatientMedicalInstructions value = (IPatientMedicalInstructions) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Act) eObject);
		this.getCDAType().addAct((org.openhealthtools.mdht.uml.cda.Act) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IMedicationSplitDose addId(II value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IMedicationSplitDose setRateQuantity(IVL_PQ value) {
		this.getCDAType().setRateQuantity(value);
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IMedicationSplitDose setMedicationType(IMedicationType value) {
		this.getCDAType().addObservation((org.openhealthtools.mdht.uml.cda.Observation) value);
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IMedicationSplitDose addMedicationOrderInformation(IMedicationOrderInformation value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IMedicationSplitDose setReactionObservation(IReactionObservation value) {
		this.getCDAType().addObservation((org.openhealthtools.mdht.uml.cda.Observation) value);
		return this;
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
	@Override
	public EList<II> getIds() {
		if (GET_IDS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getMedicationSplitDose(),
				IDomainPackage.eINSTANCE.getMedicationSplitDose().getEAllOperations().get(0));
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
	@Override
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
	 * The cached OCL expression body for the '{@link #getRateQuantity() <em>Get Rate Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RATE_QUANTITY__EOCL_EXP = "self.rateQuantity.oclAsType(datatypes::IVL_PQ)";

	/**
	 * The cached OCL query for the '{@link #getRateQuantity() <em>Get Rate Quantity</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateQuantity()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RATE_QUANTITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IVL_PQ getRateQuantity() {
		if (GET_RATE_QUANTITY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getMedicationSplitDose(),
				IDomainPackage.eINSTANCE.getMedicationSplitDose().getEAllOperations().get(18));
			try {
				GET_RATE_QUANTITY__EOCL_QRY = helper.createQuery(GET_RATE_QUANTITY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RATE_QUANTITY__EOCL_QRY);
		return (IVL_PQ) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IVL_PQ withRateQuantity() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("IVL_PQ");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		IVL_PQ value = (IVL_PQ) eObject;
		this.getCDAType().setRateQuantity(value);
		return value;
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationType() <em>Get Medication Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationType()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_TYPE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::MedicationType))->asSequence()->first().oclAsType(domain::MedicationType)";

	/**
	 * The cached OCL query for the '{@link #getMedicationType() <em>Get Medication Type</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationType()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_TYPE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IMedicationType getMedicationType() {
		if (GET_MEDICATION_TYPE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getMedicationSplitDose(),
				IDomainPackage.eINSTANCE.getMedicationSplitDose().getEAllOperations().get(51));
			try {
				GET_MEDICATION_TYPE__EOCL_QRY = helper.createQuery(GET_MEDICATION_TYPE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_TYPE__EOCL_QRY);
		return (IMedicationType) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IMedicationType withMedicationType() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("MedicationType");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("MedicationType");
		IMedicationType value = (IMedicationType) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Observation) eObject);
		this.getCDAType().addObservation((org.openhealthtools.mdht.uml.cda.Observation) eObject);
		return value;
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationOrderInformations() <em>Get Medication Order Informations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationOrderInformations()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_ORDER_INFORMATIONS__EOCL_EXP = "self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(domain::MedicationOrderInformation)).oclAsType(domain::MedicationOrderInformation)";

	/**
	 * The cached OCL query for the '{@link #getMedicationOrderInformations() <em>Get Medication Order Informations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationOrderInformations()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_ORDER_INFORMATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IMedicationOrderInformation> getMedicationOrderInformations() {
		if (GET_MEDICATION_ORDER_INFORMATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getMedicationSplitDose(),
				IDomainPackage.eINSTANCE.getMedicationSplitDose().getEAllOperations().get(54));
			try {
				GET_MEDICATION_ORDER_INFORMATIONS__EOCL_QRY = helper.createQuery(GET_MEDICATION_ORDER_INFORMATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_ORDER_INFORMATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<IMedicationOrderInformation> result = (Collection<IMedicationOrderInformation>) query.evaluate(this);
		return new BasicEList.UnmodifiableEList<IMedicationOrderInformation>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IMedicationOrderInformation addMedicationOrderInformation() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("MedicationOrderInformation");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("MedicationOrderInformation");
		IMedicationOrderInformation value = (IMedicationOrderInformation) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Supply) eObject);
		this.getCDAType().addSupply((org.openhealthtools.mdht.uml.cda.Supply) eObject);
		return value;
	}

	/**
	 * The cached OCL expression body for the '{@link #getReactionObservation() <em>Get Reaction Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionObservation()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REACTION_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::ReactionObservation))->asSequence()->first().oclAsType(domain::ReactionObservation)";

	/**
	 * The cached OCL query for the '{@link #getReactionObservation() <em>Get Reaction Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionObservation()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REACTION_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IReactionObservation getReactionObservation() {
		if (GET_REACTION_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getMedicationSplitDose(),
				IDomainPackage.eINSTANCE.getMedicationSplitDose().getEAllOperations().get(57));
			try {
				GET_REACTION_OBSERVATION__EOCL_QRY = helper.createQuery(GET_REACTION_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REACTION_OBSERVATION__EOCL_QRY);
		return (IReactionObservation) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IReactionObservation withReactionObservation() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ccd");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ccd");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ReactionObservation");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("ReactionObservation");
		IReactionObservation value = (IReactionObservation) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Observation) eObject);
		this.getCDAType().addObservation((org.openhealthtools.mdht.uml.cda.Observation) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IMedicationSplitDose init() {
		CDAUtil.init(this);
		return this;
	}
} // MedicationSplitDoseImpl
